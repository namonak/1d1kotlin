package boj.problems

import java.io.BufferedReader

class No20364 {
    fun solve(input: BufferedReader): String {
        val (_, q) = input.readLine().split(" ").map { it.toLong() }
        val occupied = mutableSetOf<Long>()
        val result = StringBuilder()

        repeat(q.toInt()) {
            val x = input.readLine().toLong()
            var cur = x
            var blocked: Long = 0

            while (cur > 1) {
                if (cur in occupied) {
                    blocked = cur
                }
                cur /= 2
            }

            if (blocked == 0L) {
                occupied.add(x)
            }

            result.appendLine(blocked)
        }

        return result.toString().trimEnd()
    }
}
