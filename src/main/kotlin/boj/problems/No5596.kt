package boj.problems

import java.io.BufferedReader

object No5596 {
    fun solve(input: BufferedReader): String {
        val (s, t) = input.lineSequence().map { it.split(" ").map { it.toInt() } }.toList()
        val sSum = s.sum()
        val tSum = t.sum()
        return if (sSum > tSum) sSum.toString() else tSum.toString()
    }
}
