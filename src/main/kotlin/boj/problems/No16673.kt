package boj.problems

import java.io.BufferedReader

class No16673 {
    fun solve(input: BufferedReader): String {
        val (c, k, p) = input.readLine().split(" ").map { it.toInt() }

        var totalWines = 0
        for (n in 1..c) {
            totalWines += k * n + p * n * n
        }

        return totalWines.toString()
    }
}
