package boj.problems

import java.io.BufferedReader

class No2018 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var count = 0
        var sum = 0
        var start = 1
        var end = 1

        while (start <= n) {
            if (sum == n) {
                count++
                sum -= start
                start++
            } else if (sum < n) {
                sum += end
                end++
            } else {
                sum -= start
                start++
            }
        }

        return count.toString()
    }
}
