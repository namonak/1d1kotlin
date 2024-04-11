package boj.problems

import java.io.BufferedReader

class No2491 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val arr = input.readLine().split(" ").map { it.toInt() }
        var count = 1
        var result = 1

        for (i in 1 until n) {
            if (arr[i - 1] <= arr[i]) {
                count++
                result = maxOf(result, count)
            } else {
                count = 1
            }
        }

        count = 1
        for (i in 1 until n) {
            if (arr[i - 1] >= arr[i]) {
                count++
                result = maxOf(result, count)
            } else {
                count = 1
            }
        }

        return result.toString()
    }
}
