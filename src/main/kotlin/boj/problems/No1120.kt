package boj.problems

import java.io.BufferedReader

object No1120 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ")
        var min = Int.MAX_VALUE
        for (i in 0..b.length - a.length) {
            var diff = 0
            for (j in a.indices) {
                if (a[j] != b[i + j]) diff++
            }
            min = min.coerceAtMost(diff)
        }
        return min.toString()
    }
}
