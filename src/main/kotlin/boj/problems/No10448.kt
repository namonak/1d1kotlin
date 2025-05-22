package boj.problems

import java.io.BufferedReader

class No10448 {
    companion object {
        private const val MAX_VALUE = 1000
        private const val POSSIBLE_ANSWER = 1
        private const val IMPOSSIBLE_ANSWER = 0
    }

    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val canBeExpressed = calculatePossibleSums()
        val result = StringBuilder()

        repeat(t) {
            val number = input.readLine().toInt()
            val answer = if (canBeExpressed[number]) POSSIBLE_ANSWER else IMPOSSIBLE_ANSWER
            result.append(answer).append('\n')
        }

        return result.toString().trimEnd()
    }

    /**
     * 1000 이하의 모든 삼각수를 생성합니다.
     */
    private fun generateTriangularNumbers(): List<Int> {
        val triangulars = mutableListOf<Int>()
        var n = 1

        while (true) {
            val triangular = calculateTriangularNumber(n)
            if (triangular > MAX_VALUE) break

            triangulars.add(triangular)
            n++
        }

        return triangulars
    }

    /**
     * n번째 삼각수를 계산합니다.
     * 삼각수 공식: n * (n + 1) / 2
     */
    private fun calculateTriangularNumber(n: Int): Int {
        return n * (n + 1) / 2
    }

    /**
     * 세 개의 삼각수의 합으로 표현 가능한 수들을 미리 계산합니다.
     */
    private fun calculatePossibleSums(): BooleanArray {
        val triangulars = generateTriangularNumbers()
        val canBeExpressed = BooleanArray(MAX_VALUE + 1)

        // 세 개의 삼각수 조합으로 만들 수 있는 모든 합을 체크
        for (first in triangulars) {
            for (second in triangulars) {
                for (third in triangulars) {
                    val sum = first + second + third
                    if (sum <= MAX_VALUE) {
                        canBeExpressed[sum] = true
                    }
                }
            }
        }

        return canBeExpressed
    }
}
