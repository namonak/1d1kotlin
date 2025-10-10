package boj.problems

import java.io.BufferedReader

class No10250 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val (h, _, n) = input.readLine().split(" ").map { it.toInt() }
            val floor = if (n % h == 0) h else n % h
            val room = if (n % h == 0) n / h else n / h + 1

            result.append("${floor * 100 + room}\n")
        }

        return result.toString().trimEnd()
    }
}
