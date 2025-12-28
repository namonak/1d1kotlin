package boj.problems

import java.io.BufferedReader

class No11645 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val result = StringBuilder()

        repeat(testCaseCount) {
            val tripCount = input.readLine().toInt()
            result.append(countDistinctCities(input, tripCount)).append('\n')
        }

        return result.toString().trimEnd()
    }

    private fun countDistinctCities(
        input: BufferedReader,
        tripCount: Int
    ): Int {
        val visitedCities = mutableSetOf<String>()

        repeat(tripCount) {
            visitedCities.add(input.readLine())
        }

        return visitedCities.size
    }
}
