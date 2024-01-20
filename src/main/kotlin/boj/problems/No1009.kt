package boj.problems

import java.io.BufferedReader

object No1009 {
    fun solve(input: BufferedReader): String {
        val numberOfCases = input.readLine().toInt()
        val result = StringBuilder()

        for (i in 1..numberOfCases) {
            val (a, b) = input.readLine().split(' ').map { it.toInt() }
            var computerNumber = 1

            for (j in 1..b) {
                computerNumber = (computerNumber * a) % 10
            }

            if (computerNumber == 0) computerNumber = 10

            result.append("$computerNumber\n")
        }

        return result.toString().trimEnd()
    }
}
