package boj.problems

import java.io.BufferedReader

class No1181 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val arr = Array(n) { input.readLine() }
        val result = arr.distinct().sortedWith(compareBy({ it.length }, { it }))

        return result.joinToString("\n").trimEnd()
    }
}
