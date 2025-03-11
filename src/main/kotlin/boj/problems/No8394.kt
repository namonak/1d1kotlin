package boj.problems

import java.io.BufferedReader

class No8394 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        if (n == 1) return "1"
        if (n == 2) return "2"

        var prev = 1
        var curr = 2

        for (i in 3..n) {
            val next = (prev + curr) % 10
            prev = curr
            curr = next
        }

        return "$curr"
    }
}
