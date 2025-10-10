package boj.problems.step2

import java.io.BufferedReader

object No2753 {
    fun solve(input: BufferedReader): String {
        val year = input.readLine().toInt()
        return if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            "1"
        } else {
            "0"
        }
    }
}
