package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No14490 {
    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine(), ":")
        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()
        val g = gcd(n, m)

        return ("${n / g}:${m / g}").toString()
    }

    private fun gcd(
        a: Int,
        b: Int
    ): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
