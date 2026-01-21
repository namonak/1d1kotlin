package boj.problems

import java.io.BufferedReader

class No1148 {
    fun solve(input: BufferedReader): String {
        val dictionary = mutableListOf<Word>()

        // 1. 사전 입력 처리
        while (true) {
            val line = input.readLine() ?: break
            if (line == "-") break
            dictionary.add(Word(line))
        }

        val resultBuilder = StringBuilder()

        // 2. 퍼즐판 입력 처리
        while (true) {
            val board = input.readLine() ?: break
            if (board == "#") break

            resultBuilder.append(processPuzzle(board, dictionary)).append("\n")
        }

        return resultBuilder.toString().trimEnd()
    }

    private fun processPuzzle(
        board: String,
        dictionary: List<Word>
    ): String {
        val boardCounter = AlphabetCounter(board)
        val charUsageCount = IntArray(26) { 0 }

        // 보드에 존재하는 알파벳 종류 추출 (중복 제거)
        val presentAlphabetIndices = board.map { it - 'A' }.distinct()

        // 각 단어가 보드의 글자들로 구성 가능한지 확인
        for (word in dictionary) {
            if (word.canBeMadeWith(boardCounter)) {
                // 단어를 만들 수 있다면, 단어에 포함된 각 알파벳의 '사용 가능 횟수' 증가
                for (charIndex in word.uniqueCharIndices) {
                    charUsageCount[charIndex]++
                }
            }
        }

        // 보드에 있는 문자들 중 최솟값과 최댓값 찾기
        var minCount = Int.MAX_VALUE
        var maxCount = Int.MIN_VALUE

        for (index in presentAlphabetIndices) {
            val count = charUsageCount[index]
            if (count < minCount) minCount = count
            if (count > maxCount) maxCount = count
        }

        // 결과 문자열 조립
        val minChars = presentAlphabetIndices.filter { charUsageCount[it] == minCount }
            .map { (it + 'A'.code).toChar() }.sorted().joinToString("")
        val maxChars = presentAlphabetIndices.filter { charUsageCount[it] == maxCount }
            .map { (it + 'A'.code).toChar() }.sorted().joinToString("")

        return "$minChars $minCount $maxChars $maxCount"
    }

    /**
     * 단어의 알파벳 구성을 저장하는 클래스
     */
    private class Word(val text: String) {
        val counter = AlphabetCounter(text)

        // 단어에 포함된 고유한 알파벳 인덱스 리스트 (카운팅 최적화용)
        val uniqueCharIndices = text.map { it - 'A' }.distinct()

        fun canBeMadeWith(boardCounter: AlphabetCounter): Boolean {
            // 퍼즐판 글자 수보다 단어 글자 수가 많으면 불가능
            if (this.text.length > 9) return false

            for (i in 0 until 26) {
                if (this.counter.counts[i] > boardCounter.counts[i]) {
                    return false
                }
            }
            return true
        }
    }

    /**
     * 알파벳 빈도수를 측정하는 유틸리티 클래스
     */
    private class AlphabetCounter(text: String) {
        val counts = IntArray(26)

        init {
            for (char in text) {
                counts[char - 'A']++
            }
        }
    }
}
