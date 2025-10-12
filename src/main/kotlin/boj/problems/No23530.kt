package boj.problems

import java.io.BufferedReader

private const val C_MIN = 1
private const val C_MAX = 50

class No23530 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val out = StringBuilder()

        repeat(t) {
            val (a, b) = input.readLine().trim().split(" ").map(String::toInt)
            val sum = a + b
            out.appendLine(pickC(sum).toString())
        }

        return out.toString().trimEnd()
    }

    private fun pickC(sum: Int): Int {
        for (c in C_MIN..C_MAX) if (c != sum) return c
        error("unreachable") // 항상 하나는 존재
    }
}
