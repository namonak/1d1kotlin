package boj.problems

import java.io.BufferedReader

class No28135 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var currentCount = 0

        for (number in 1..n) {
            currentCount += if (number.toString().contains("50")) {
                2
            } else {
                1
            }
        }

        if (n.toString().contains("50")) {
            currentCount--
        }

        return currentCount.toString()
    }
}
