package boj.problems

import java.io.BufferedReader

class No13458 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val a = input.readLine().split(" ").map { it.toLong() }
        val (b, c) = input.readLine().split(" ").map { it.toInt() }

        return (n + a.sumOf { (it - b).coerceAtLeast(0) / c + if ((it - b) % c > 0) 1 else 0 }).toString()
    }
}
