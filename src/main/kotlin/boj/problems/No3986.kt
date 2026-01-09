package boj.problems

import java.io.BufferedReader
import java.util.ArrayDeque

class No3986 {
    fun solve(input: BufferedReader): String {
        val wordCount = input.readLine().toInt()
        var goodWordCount = 0

        repeat(wordCount) {
            val word = input.readLine()
            if (isGoodWord(word)) {
                goodWordCount++
            }
        }

        return goodWordCount.toString()
    }

    /**
     * 주어진 단어가 '좋은 단어'인지 판별합니다.
     * 스택을 사용하여 같은 문자가 연속(혹은 아치형 연결)되는지 확인합니다.
     */
    private fun isGoodWord(word: String): Boolean {
        // 단어의 길이가 홀수라면 절대 짝이 맞을 수 없음 (빠른 종료)
        if (word.length % 2 != 0) return false

        val stack = ArrayDeque<Char>()

        for (char in word) {
            // 스택의 가장 위(최근) 문자와 현재 문자가 같으면 짝이 맞으므로 제거
            if (stack.isNotEmpty() && stack.peek() == char) {
                stack.pop()
            } else {
                // 다르거나 스택이 비어있으면 스택에 추가
                stack.push(char)
            }
        }

        // 스택이 비어있다면 모든 문자가 짝을 찾아 나간 것
        return stack.isEmpty()
    }
}
