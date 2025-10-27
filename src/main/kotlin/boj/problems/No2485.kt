package boj.problems

import java.io.BufferedReader

class No2485 {
    fun solve(input: BufferedReader): String {
        val count = input.readLine().toInt()
        val trees = mutableListOf<Int>()

        repeat(count) {
            trees.add(input.readLine().toInt())
        }

        val distances = mutableListOf<Int>()
        for (i in 0 until count - 1) {
            distances.add(trees[i + 1] - trees[i])
        }

        var gcd = gcd(distances[0], distances[1])
        for (i in 2 until distances.size) {
            gcd = gcd(gcd, distances[i])
        }

        return ((trees.last() - trees.first()) / gcd - count + 1).toString()
    }

    private fun gcd(
        a: Int,
        b: Int
    ): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
