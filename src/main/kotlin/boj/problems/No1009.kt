package boj.problems

import java.io.BufferedReader

class No1009 {
    fun solve(input: BufferedReader): String {
        val numberOfCases = input.readLine().toInt()
        val result = StringBuilder()

        repeat(numberOfCases) {
            val (a, b) = input.readLine().split(' ').map { it.toInt() }
            var computerNumber = 1

            repeat(b) {
                computerNumber = (computerNumber * a) % 10
            }

            if (computerNumber == 0) computerNumber = 10

            result.append("$computerNumber\n")
        }

        return result.toString().trimEnd()
    }
}
