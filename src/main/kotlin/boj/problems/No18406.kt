package boj.problems

import java.io.BufferedReader

class No18406 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine()
        val (a, b) = n.chunked(n.length / 2)

        return if (a.sumOf { it.toString().toInt() } == b.sumOf { it.toString().toInt() }) {
            "LUCKY"
        } else {
            "READY"
        }
    }
}
