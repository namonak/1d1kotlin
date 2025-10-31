package boj.problems

import java.io.BufferedReader

class No7595 {
    fun solve(input: BufferedReader): String {
        val sizes = mutableListOf<Int>()
        while (true) {
            val line = input.readLine() ?: break
            val n = line.trim().toInt()
            if (n == 0) break
            sizes += n
        }

        val out = StringBuilder()
        for (size in sizes) {
            out.appendTriangle(size)
        }

        return out.toString().trimEnd()
    }

    private fun StringBuilder.appendTriangle(size: Int) {
        for (stars in 1..size) {
            append("*".repeat(stars)).append('\n')
        }
    }
}
