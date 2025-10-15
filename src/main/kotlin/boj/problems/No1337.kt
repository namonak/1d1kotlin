package boj.problems

import java.io.BufferedReader

class No1337 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val arr = IntArray(n) { input.readLine().toInt() }.sorted()
        var min = Int.MAX_VALUE
        for (i in 0 until n) {
            var cnt = 1
            for (j in i + 1 until n) {
                if (arr[j] - arr[i] < 5) {
                    cnt++
                } else {
                    break
                }
            }
            min = min.coerceAtMost(5 - cnt)
        }
        return min.toString()
    }
}
