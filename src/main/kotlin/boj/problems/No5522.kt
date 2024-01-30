package boj.problems

import java.io.BufferedReader

object No5522 {
    fun solve(input: BufferedReader): String {
        return input.lineSequence()
            .map { it.toInt() }
            .sum()
            .toString()
    }
}
