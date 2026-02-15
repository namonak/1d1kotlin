package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No5557 {
    fun solve(input: BufferedReader): String {
        val totalNumbers = input.readLine().toInt()
        val tokenizer = StringTokenizer(input.readLine())
        val numbers = IntArray(totalNumbers) { tokenizer.nextToken().toInt() }

        val resultCount = countValidEquations(numbers)
        return resultCount.toString()
    }

    private fun countValidEquations(numbers: IntArray): Long {
        val n = numbers.size
        val targetValue = numbers.last()

        // dp[단계][현재 합계] = 경우의 수
        val dp = Array(n - 1) { LongArray(POSSIBLE_VALUE_COUNT) }

        // 초기 상태 설정: 첫 번째 숫자는 무조건 포함
        dp[0][numbers[0]] = 1L

        // 마지막 숫자(결과값)를 제외한 n-2개의 연산 수행
        for (i in 1 until n - 1) {
            val currentNum = numbers[i]
            for (prevSum in MIN_ALLOWED_VALUE..MAX_ALLOWED_VALUE) {
                val waysToReachPrevSum = dp[i - 1][prevSum]
                if (waysToReachPrevSum == 0L) continue

                // 덧셈 연산
                val nextSumPlus = prevSum + currentNum
                if (nextSumPlus <= MAX_ALLOWED_VALUE) {
                    dp[i][nextSumPlus] += waysToReachPrevSum
                }

                // 뺄셈 연산
                val nextSumMinus = prevSum - currentNum
                if (nextSumMinus >= MIN_ALLOWED_VALUE) {
                    dp[i][nextSumMinus] += waysToReachPrevSum
                }
            }
        }

        // 마지막 연산 단계(n-2)에서 목표값(numbers[n-1])에 도달한 경우의 수 반환
        return dp[n - 2][targetValue]
    }

    companion object {
        private const val MIN_ALLOWED_VALUE = 0
        private const val MAX_ALLOWED_VALUE = 20
        private const val POSSIBLE_VALUE_COUNT = MAX_ALLOWED_VALUE + 1
    }
}
