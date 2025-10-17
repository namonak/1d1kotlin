package boj.problems

import java.io.BufferedReader

class No10039 {
    fun solve(input: BufferedReader): String {
        val scores = input.readLines().map { it.toInt() }
        return (scores.map { if (it < 40) 40 else it }.sum() / scores.size).toString()
    }
}
