package boj.problems

import java.io.BufferedReader

class No12871 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val t = input.readLine()
        val lcmLen = lcm(s.length, t.length)
        val sRepeated = s.repeat(lcmLen / s.length)
        val tRepeated = t.repeat(lcmLen / t.length)

        return if (sRepeated == tRepeated) "1" else "0"
    }

    private fun lcm(a: Int, b: Int): Int = a * b / gcd(a, b)

    private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
