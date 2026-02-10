package boj.problems

import java.io.BufferedReader

class No1769 {
    fun solve(input: BufferedReader): String {
        val initialNumberStr = input.readLine()

        // 1. 예외 처리: 입력 자체가 한 자리 수인 경우
        if (initialNumberStr.length < 2) {
            val number = initialNumberStr.toInt()
            return buildResultString(count = 0, finalNumber = number)
        }

        // 2. 변환 로직 수행
        val (totalCount, finalNumber) = processTransformation(initialNumberStr)

        // 3. 결과 반환
        return buildResultString(totalCount, finalNumber)
    }

    private fun processTransformation(startNumberStr: String): Pair<Int, Int> {
        var count = 1
        var currentSum = sumDigitsFromString(startNumberStr)

        while (currentSum >= 10) {
            currentSum = sumDigitsFromInt(currentSum)
            count++
        }

        return Pair(count, currentSum)
    }

    private fun sumDigitsFromString(numberStr: String): Int {
        return numberStr.sumOf { it.digitToInt() }
    }

    private fun sumDigitsFromInt(number: Int): Int {
        var temp = number
        var sum = 0
        while (temp > 0) {
            sum += temp % 10
            temp /= 10
        }
        return sum
    }

    private fun buildResultString(
        count: Int,
        finalNumber: Int
    ): String {
        val isMultipleOfThree = (finalNumber % 3 == 0)
        val resultText = if (isMultipleOfThree) "YES" else "NO"

        return "$count\n$resultText"
    }
}
