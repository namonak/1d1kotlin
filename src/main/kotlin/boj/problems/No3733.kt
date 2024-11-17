package boj.problems

import java.io.BufferedReader

class No3733 {
    fun solve(input: BufferedReader): String {
        val results = mutableListOf<Int>()

        while (true) {
            val line = input.readLine() ?: break
            val tokens = line.split("\\s+".toRegex()).filter { it.isNotEmpty() }

            var i = 0
            while (i < tokens.size) {
                val n = tokens[i].toInt()
                val s = tokens[i + 1].toLong()
                val x = (s / (n + 1))
                results.add(x.toInt())
                i += 2
            }
        }

        return results.joinToString("\n").trimEnd()
    }
}
