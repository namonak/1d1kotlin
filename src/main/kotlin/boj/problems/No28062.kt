package boj.problems

import java.io.BufferedReader

object No28062 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val candies = input.readLine().split(" ").map { it.toInt() }

        val totalCandies = candies.sum()

        if (totalCandies % 2 == 0) {
            return totalCandies.toString()
        }

        val minOddCandy = candies.filter { it % 2 != 0 }.minOrNull()

        return if (minOddCandy != null) {
            (totalCandies - minOddCandy).toString()
        } else {
            "0"
        }
    }
}
