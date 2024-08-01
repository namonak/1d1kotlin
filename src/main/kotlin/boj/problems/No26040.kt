package boj.problems

import java.io.BufferedReader

class No26040 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val c = input.readLine().split(" ").map { it[0] }
        return s.map { if (it in c) it.lowercaseChar() else it }.joinToString("")
    }
}
