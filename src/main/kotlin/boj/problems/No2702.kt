package boj.problems

import java.io.BufferedReader

object No2702 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(t) {
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            val gcd = gcd(a, b)
            val lcm = a * b / gcd
            sb.append("$lcm $gcd\n")
        }
        return sb.toString().trimEnd()
    }

    private fun gcd(
        a: Int,
        b: Int
    ): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
