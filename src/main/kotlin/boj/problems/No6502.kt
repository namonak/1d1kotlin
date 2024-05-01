package boj.problems

import java.io.BufferedReader

class No6502 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        var caseNumber = 1

        fun Double.squared() = this * this

        while (true) {
            val line = input.readLine() ?: break
            if (line == "0") break

            val (r, w, l) = line.split(" ").map { it.toDouble() }
            val fits = (r * 2).squared() >= w.squared() + l.squared()
            val message = if (fits) "fits on the table.\n" else "does not fit on the table.\n"

            result.append("Pizza $caseNumber $message")
            caseNumber++
        }

        return result.toString().trimEnd()
    }
}
