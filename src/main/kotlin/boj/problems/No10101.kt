package boj.problems

import java.io.BufferedReader

object No10101 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = (1..3).map { input.readLine().toInt() }
        return when {
            a == b && b == c -> "Equilateral"
            a + b + c == 180 -> when {
                a == b || b == c || a == c -> "Isosceles"
                else -> "Scalene"
            }
            else -> "Error"
        }
    }
}
