package boj.problems

import java.io.BufferedReader

class No28352 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        var factorial: Long = 1
        for (i in 1..n) {
            factorial *= i
        }

        val secondsInAWeek: Long = 60 * 60 * 24 * 7

        return (factorial / secondsInAWeek).toString()
    }
}
