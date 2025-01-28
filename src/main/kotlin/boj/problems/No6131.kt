package boj.problems

import java.io.BufferedReader

class No6131 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var count = 0

        for (a in 1..500) {
            for (b in 1..a) {
                if ((a * a) - (b * b) == n) {
                    count++
                }
            }
        }

        return count.toString()
    }
}
