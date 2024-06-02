package boj.problems

import java.io.BufferedReader

class No1817 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        if (n == 0) return "0"
        val weights = input.readLine().split(" ").map { it.toInt() }

        var count = 0
        var sum = 0

        for (i in weights.indices) {
            sum += weights[i]
            if (sum > m) {
                count++
                sum = weights[i]
            }
        }

        return (count + 1).toString()
    }
}
