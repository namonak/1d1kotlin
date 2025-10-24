package boj.problems

import java.io.BufferedReader

class No5522 {
    fun solve(input: BufferedReader): String {
        return input.lineSequence()
            .map { it.toInt() }
            .sum()
            .toString()
    }
}
