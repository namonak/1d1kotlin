package boj.problems

import java.io.BufferedReader

class No9933 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val words = List(n) { input.readLine() }
        val wordSet = words.toSet()
        val candidate = words.first { wordSet.contains(it.reversed()) }
        return "${candidate.length} ${candidate[candidate.length / 2]}"
    }
}
