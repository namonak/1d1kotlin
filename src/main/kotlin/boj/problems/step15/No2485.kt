package boj.problems.step15

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2485.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No2485 {
    fun solve(input: BufferedReader): Int {
        val count = input.readLine().toInt()
        val trees = mutableListOf<Int>()
        for (i in 0 until count) {
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

        return (trees.last() - trees.first()) / gcd - count + 1
    }

    private fun gcd(
        a: Int,
        b: Int
    ): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
