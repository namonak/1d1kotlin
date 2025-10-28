package boj.problems

import java.io.BufferedReader

class No1026 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val a = input.readLine().split(" ").map { it.toInt() }.sorted()
        val b = input.readLine().split(" ").map { it.toInt() }.sortedDescending()

        var sum = 0
        for (i in 0 until n) {
            sum += a[i] * b[i]
        }

        return sum.toString()
    }
}
