package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No29716 {
    fun solve(input: BufferedReader): String {
        val tokenizer = StringTokenizer(input.readLine())
        val maxSize = tokenizer.nextToken().toInt()
        val problemCount = tokenizer.nextToken().toInt()

        var solvableCount = 0

        repeat(problemCount) {
            val problemString = input.readLine()
            if (calculateSize(problemString) <= maxSize) {
                solvableCount++
            }
        }

        return solvableCount.toString()
    }

    /**
     * 문제 문자열의 크기를 계산합니다.
     * 대문자: 4, 소문자/숫자: 2, 공백: 1
     */
    private fun calculateSize(text: String): Int {
        return text.fold(0) { acc, char ->
            acc + when {
                char.isUpperCase() -> 4
                char.isLowerCase() || char.isDigit() -> 2
                char.isWhitespace() -> 1
                else -> 0 // 문제 조건 외 문자는 0 처리 (혹은 예외처리)
            }
        }
    }
}
