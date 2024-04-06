package boj.problems

import java.io.BufferedReader

class No1813 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val arr = input.readLine().split(" ").map { it.toInt() }
        val count = IntArray(n + 1)

        for (i in arr) {
            if (i <= n) {
                count[i]++
            }
        }

        for (i in n downTo 0) {
            if (count[i] == i) {
                return i.toString()
            }
        }

        return "-1"
    }
}
