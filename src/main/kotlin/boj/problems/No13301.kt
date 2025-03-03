package boj.problems

import java.io.BufferedReader

class No13301 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var a = 1L
        var b = 1L

        if (n == 1) {
            return (2 * (a + b)).toString()
        }

        for (i in 3..(n + 1)) {
            val c = a + b
            a = b
            b = c
        }

        return (2 * (a + b)).toString()
    }
}
