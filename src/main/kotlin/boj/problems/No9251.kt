package boj.problems

import java.io.BufferedReader

class No9251 {
    fun solve(input: BufferedReader): String {
        val strA = input.readLine()
        val strB = input.readLine()
        return lcsLenSpaceOptimized(strA, strB).toString()
    }

    private fun lcsLenSpaceOptimized(
        a: String,
        b: String
    ): Int {
        val (s, t) = if (a.length <= b.length) a to b else b to a
        val m = t.length
        var prev = IntArray(m + 1)
        var curr = IntArray(m + 1)
        for (ch in s) {
            for (j in 1..m) {
                curr[j] = if (ch == t[j - 1]) prev[j - 1] + 1 else maxOf(prev[j], curr[j - 1])
            }
            // swap
            val tmp = prev
            prev = curr
            curr = tmp
        }
        return prev[m]
    }
}
