package boj.problems

import java.io.BufferedReader

class No8371 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val a = input.readLine()
        val b = input.readLine()
        var count = 0
        for (i in 0 until n) {
            if (a[i] != b[i]) {
                count++
            }
        }
        return count.toString()
    }
}
