package boj.problems

import java.io.BufferedReader

class No25707 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val beads = input.readLine().split(" ").map { it.toLong() }
        val max = beads.maxOrNull() ?: 0
        val min = beads.minOrNull() ?: 0

        return (2L * (max - min)).toString()
    }
}
