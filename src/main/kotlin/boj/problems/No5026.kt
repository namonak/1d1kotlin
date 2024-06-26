package boj.problems

import java.io.BufferedReader

class No5026 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val results = mutableListOf<String>()
        repeat(n) {
            val line = input.readLine()
            if (line == "P=NP") {
                results.add("skipped")
            } else {
                val (a, b) = line.split("+").map { it.toInt() }
                results.add((a + b).toString())
            }
        }
        return results.joinToString("\n")
    }
}
