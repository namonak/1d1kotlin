package boj.problems

import java.io.BufferedReader
import java.util.Locale

class No6177 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine()?.trim()?.toInt() ?: return ""
        val numbers = DoubleArray(n) { input.readLine().trim().toDouble() }

        numbers.sort()

        val mean = numbers.average()
        val median = calculateMedian(numbers)

        // 오차 범위 0.002 이내를 만족하기 위해 소수점 6자리까지 출력합니다.
        // Locale.US를 사용하여 시스템 언어와 관계없이 마침표(.)가 소수점으로 나오도록 보장합니다.
        return String.format(Locale.US, "%.6f\n%.6f", mean, median)
    }

    private fun calculateMedian(sortedNumbers: DoubleArray): Double {
        val size = sortedNumbers.size
        if (size == 0) return 0.0

        val middleIndex = size / 2

        return if (size % 2 != 0) {
            // N이 홀수일 때: 정중앙의 값
            sortedNumbers[middleIndex]
        } else {
            // N이 짝수일 때: 중앙 두 값의 평균
            (sortedNumbers[middleIndex - 1] + sortedNumbers[middleIndex]) / 2.0
        }
    }
}
