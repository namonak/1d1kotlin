package boj.problems

import java.io.BufferedReader

class No1789 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine().toLong()

        var sum = 0L
        var count = 0
        var i = 0

        while (true) {
            sum += ++i
            if (sum > s) {
                return count.toString()
            }
            count++
        }
    }
}
