package boj.problems

import java.io.BufferedReader

class No15232 {
    fun solve(input: BufferedReader): String {
        val r = input.readLine().toInt()
        val c = input.readLine().toInt()

        return buildString {
            repeat(r) {
                append("*".repeat(c)).appendLine()
            }
        }.trimEnd()
    }
}
