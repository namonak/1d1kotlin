package boj.problems

import java.io.BufferedReader

class No23278 {
    fun solve(input: BufferedReader): String {
        val (n, l, h) = input.readLine().split(" ").map { it.toInt() }
        val scores = input.readLine().split(" ").map { it.toInt() }.toIntArray()

        scores.sort()
        val average = scores.sliceArray(l until n - h).average()
        val formatted = "%.9f".format(average)

        return formatted
    }
}
