package boj.problems

import java.io.BufferedReader

class No1059 {
    fun solve(input: BufferedReader): String {
        val l = input.readLine().toInt()
        val s = input.readLine().split(" ").map { it.toInt() }.sorted()
        val n = input.readLine().toInt()

        if (s.contains(n)) return "0"

        var left = 0
        var right = 0

        for (i in 0 until l) {
            if (s[i] < n) left = s[i]
            if (s[i] > n) {
                right = s[i]
                break
            }
        }

        return ((n - left - 1) * (right - n) + (right - n - 1)).toString()
    }
}
