package boj.problems

import java.io.BufferedReader

class No1356 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine().trim()
        val length = number.length

        for (i in 1 until length) {
            val leftPart = number.substring(0, i)
            val rightPart = number.substring(i)

            val leftProduct = leftPart.fold(1) { acc, c -> acc * (c - '0') }
            val rightProduct = rightPart.fold(1) { acc, c -> acc * (c - '0') }

            if (leftProduct == rightProduct) {
                return "YES"
            }
        }
        return "NO"
    }
}
