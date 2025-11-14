package boj.problems

import java.io.BufferedReader

class No4539 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().trim().toInt()
        val result = StringBuilder()

        repeat(testCaseCount) {
            var number = input.readLine().trim().toInt()
            var unit = START_UNIT

            while (number >= unit) {
                val currentDigit = (number % unit) / (unit / 10)

                number = if (currentDigit >= HALF_UNIT_FACTOR) {
                    (number / unit + 1) * unit
                } else {
                    (number / unit) * unit
                }

                unit *= BASE
            }

            result.appendLine(number)
        }

        return result.toString().trimEnd()
    }

    companion object {
        private const val START_UNIT = 10
        private const val BASE = 10
        private const val HALF_UNIT_FACTOR = 5
    }
}
