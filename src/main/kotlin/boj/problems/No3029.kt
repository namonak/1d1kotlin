package boj.problems

import java.io.BufferedReader

class No3029 {
    fun solve(input: BufferedReader): String {
        val (h1, m1, s1) = input.readLine().split(":").map { it.toInt() }
        val (h2, m2, s2) = input.readLine().split(":").map { it.toInt() }

        val total1 = h1 * 3600 + m1 * 60 + s1
        val total2 = h2 * 3600 + m2 * 60 + s2

        val diff = if (total1 < total2) total2 - total1 else total2 + 24 * 3600 - total1

        val h = diff / 3600
        val m = diff % 3600 / 60
        val s = diff % 60

        return "%02d:%02d:%02d".format(h, m, s)
    }
}
