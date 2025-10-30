package boj.problems

import java.io.BufferedReader

class No1094 {
    fun solve(input: BufferedReader): String {
        var n = input.readLine().toInt()
        var count = 0
        while (n > 0) {
            if (n % 2 == 1) {
                count++
            }
            n /= 2
        }
        return count.toString()
    }
}
