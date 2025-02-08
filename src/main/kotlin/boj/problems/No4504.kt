package boj.problems

import java.io.BufferedReader

class No4504 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()

        while (true) {
            val num = input.readLine().toInt()
            if (num == 0) break

            if (num % n == 0) {
                result.append("$num is a multiple of $n.\n")
            } else {
                result.append("$num is NOT a multiple of $n.\n")
            }
        }
        return result.toString().trimEnd()
    }
}
