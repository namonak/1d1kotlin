package boj.problems

import java.io.BufferedReader

class No27389 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val revolutions = n / 4.0
        return String.format("%.2f", revolutions)
    }
}
