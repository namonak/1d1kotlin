package boj.problems

import java.io.BufferedReader

class No14568 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var count = 0

        for (a in 2..n step 2) {
            for (b in 1 until n) {
                val c = n - a - b
                if (c <= 0) continue
                if (c >= b + 2) {
                    count++
                }
            }
        }

        return "$count"
    }
}
