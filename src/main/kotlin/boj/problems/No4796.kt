package boj.problems

import java.io.BufferedReader

object No4796 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        var case = 0

        while (true) {
            val (l, p, v) = input.readLine().split(" ").map { it.toInt() }
            if (l == 0 && p == 0 && v == 0) break

            case++
            val answer = (v / p) * l + if (v % p > l) l else v % p
            result.append("Case $case: $answer\n")
        }

        return result.toString().trim()
    }
}
