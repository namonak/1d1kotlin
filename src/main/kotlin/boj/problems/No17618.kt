package boj.problems

import java.io.BufferedReader

class No17618 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var count = 0
        for (i in 1..n) {
            val sum = i.toString().map { it.toString().toInt() }.sum()
            if (i % sum == 0) {
                count++
            }
        }
        return count.toString()
    }
}
