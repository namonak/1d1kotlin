package boj.problems

import java.io.BufferedReader

class No1748 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var result = 0
        var length = 1
        var start = 1
        var end = 10

        while (start <= n) {
            if (end > n) {
                result += (n - start + 1) * length
            } else {
                result += (end - start) * length
            }

            start *= 10
            end *= 10
            length++
        }

        return result.toString()
    }
}
