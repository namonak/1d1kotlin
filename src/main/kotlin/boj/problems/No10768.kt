package boj.problems

import java.io.BufferedReader

class No10768 {
    fun solve(input: BufferedReader): String {
        val month = input.readLine().toInt()
        val day = input.readLine().toInt()

        return when {
            month < 2 || (month == 2 && day < 18) -> "Before"
            month == 2 && day == 18 -> "Special"
            else -> "After"
        }
    }
}
