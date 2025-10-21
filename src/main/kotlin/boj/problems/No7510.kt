package boj.problems

import java.io.BufferedReader

class No7510 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        for (i in 1..t) {
            val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
            sb.append("Scenario #$i:\n")
            sb.append(if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) "yes" else "no")
            sb.append("\n\n")
        }
        return sb.toString().trim()
    }
}
