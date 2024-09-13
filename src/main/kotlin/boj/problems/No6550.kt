package boj.problems

import java.io.BufferedReader

class No6550 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val line = input.readLine() ?: break
            val (s, t) = line.split(" ")
            result.append(if (isSubsequence(s, t)) "Yes" else "No").append("\n")
        }

        return result.toString().trimEnd()
    }

    private fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        var j = 0
        while (i < s.length && j < t.length) {
            if (s[i] == t[j]) {
                i++
            }
            j++
        }
        return i == s.length
    }
}
