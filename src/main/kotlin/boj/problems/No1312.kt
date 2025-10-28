package boj.problems

import java.io.BufferedReader

class No1312 {
    fun solve(input: BufferedReader): String {
        val (a, b, n) = input.readLine().split(" ").map { it.toInt() }
        var result = a % b

        for (i in 0 until n - 1) {
            result *= 10
            result %= b
        }

        return (result * 10 / b).toString()
    }
}
