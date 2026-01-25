package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No1057 {
    fun solve(input: BufferedReader): String {
        // 입력 처리
        val tokenizer = StringTokenizer(input.readLine())
        tokenizer.nextToken().toInt() // 로직에는 사용되지 않으나 입력 순서상 필요
        var jiminIndex = tokenizer.nextToken().toInt()
        var hansuIndex = tokenizer.nextToken().toInt()

        var currentRound = 0

        // 두 참가자의 번호가 같아질 때까지(=만날 때까지) 라운드 진행
        while (jiminIndex != hansuIndex) {
            jiminIndex = getNextRoundIndex(jiminIndex)
            hansuIndex = getNextRoundIndex(hansuIndex)
            currentRound++
        }

        return currentRound.toString()
    }

    /**
     * 다음 라운드에서 배정받을 번호를 계산합니다.
     * 공식: (현재 번호 + 1) / 2
     */
    private fun getNextRoundIndex(currentIndex: Int): Int {
        return (currentIndex + 1) / 2
    }
}
