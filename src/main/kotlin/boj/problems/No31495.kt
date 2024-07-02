package boj.problems

import java.io.BufferedReader

class No31495 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()

        if (s.length < 2 || s.first() != '"' || s.last() != '"') {
            return "CE"
        }

        val content = s.substring(1, s.length - 1)
        if (content.isEmpty()) {
            return "CE"
        }

        return content
    }
}
