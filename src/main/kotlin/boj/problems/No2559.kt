package boj.problems

import java.io.BufferedReader

object No2559 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val temperatures = input.readLine().split(" ").map { it.toInt() }

        var sum = temperatures.take(k).sum()
        var max = sum

        for (i in k until n) {
            sum += temperatures[i] - temperatures[i - k]
            max = maxOf(max, sum)
        }

        return max.toString()
    }
}
