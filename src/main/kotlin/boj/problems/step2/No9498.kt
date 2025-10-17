package boj.problems.step2

import java.io.BufferedReader

class No9498 {
    fun solve(input: BufferedReader): String {
        return when (input.readLine().toInt()) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }
    }
}
