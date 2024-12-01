package boj.problems

import java.io.BufferedReader

class No1764 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val notHeard = mutableSetOf<String>()
        repeat(n) {
            notHeard.add(input.readLine())
        }
        val notSeen = mutableSetOf<String>()
        repeat(m) {
            notSeen.add(input.readLine())
        }
        val result = notHeard.intersect(notSeen).sorted()
        return buildString {
            appendLine(result.size)
            result.forEach {
                appendLine(it)
            }
        }.trimEnd()
    }
}
