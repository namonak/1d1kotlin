package boj.problems

import java.io.BufferedReader

class No14659 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val arr = input.readLine().split(" ").map { it.toInt() }
        var max = 0
        var count = 0
        var result = 0

        for (i in 0 until n) {
            if (arr[i] > max) {
                max = arr[i]
                count = 0
            } else {
                count++
                result = result.coerceAtLeast(count)
            }
        }

        return result.toString()
    }
}
