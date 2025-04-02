package boj.problems

import java.io.BufferedReader

class No15059 {
    fun solve(input: BufferedReader): String {
        val (ca, ba, pa) = input.readLine().split(" ").map { it.toInt() }
        val (cr, br, pr) = input.readLine().split(" ").map { it.toInt() }

        val notServed = maxOf(0, cr - ca) + maxOf(0, br - ba) + maxOf(0, pr - pa)
        return "$notServed"
    }
}
