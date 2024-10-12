package boj.problems

import java.io.BufferedReader

class No8723 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
        return when {
            a == b && b == c -> "2"
            a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a -> "1"
            else -> "0"
        }
    }
}
