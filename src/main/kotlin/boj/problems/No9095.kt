package boj.problems

import java.io.BufferedReader

private const val MAX_INPUT_NUMBER = 11

class No9095 {
    fun solve(input: BufferedReader): String {
        val count = input.readLine().toInt()
        val result = Array(count) { "" }

        for (i in 0 until count) {
            val number = input.readLine().toInt()
            result[i] = getCount(number).toString()
        }

        return result.joinToString("\n")
    }

    private fun getCount(number: Int): Int {
        val memo = IntArray(MAX_INPUT_NUMBER + 1)

        memo[1] = 1
        memo[2] = 2
        memo[3] = 4

        for (i in 4..number) {
            memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3]
        }

        return memo[number]
    }
}
