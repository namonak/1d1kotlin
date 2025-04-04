package boj.problems

import java.io.BufferedReader

class No2435 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().trim().split(" ").map { it.toInt() }
        val temperatures = input.readLine().split(" ").map { it.toInt() }

        var max = Int.MIN_VALUE
        for (i in 0..n - k) {
            var sum = 0
            for (j in i until i + k) {
                sum += temperatures[j]
            }
            max = maxOf(max, sum)
        }

        return max.toString()
    }
}
