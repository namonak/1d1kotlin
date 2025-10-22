package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No2908 {
    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine())
        val a = reverseNumber(st.nextToken())
        val b = reverseNumber(st.nextToken())
        return a.coerceAtLeast(b)
    }

    private fun reverseNumber(str: String): String {
        val sb = StringBuilder(str)
        return sb.reverse().toString()
    }
}
