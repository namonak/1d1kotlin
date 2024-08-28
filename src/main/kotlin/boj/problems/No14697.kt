package boj.problems

import java.io.BufferedReader

class No14697 {
    fun solve(input: BufferedReader): String {
        val (a, b, c, n) = input.readLine().split(" ").map { it.toInt() }
        for (i in 0..n / a) {
            for (j in 0..n / b) {
                val remaining = n - (a * i + b * j)
                if (remaining % c == 0 && remaining >= 0) {
                    return "1"
                }
            }
        }
        return "0"
    }
}
