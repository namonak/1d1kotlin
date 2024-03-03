package boj.problems

import java.io.BufferedReader

class No9366 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        for (i in 1..t) {
            val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
            sb.append("Case #$i: ")
            when {
                a + b <= c || a + c <= b || b + c <= a -> sb.append("invalid!")
                a == b && b == c -> sb.append("equilateral")
                a == b || b == c || a == c -> sb.append("isosceles")
                else -> sb.append("scalene")
            }
            sb.append("\n")
        }
        return sb.toString().trim()
    }
}
