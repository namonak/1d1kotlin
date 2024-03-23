package boj.problems

import java.io.BufferedReader

class No1439 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        var count = 0
        var prev = s[0]
        for (i in 1 until s.length) {
            if (prev != s[i]) {
                count++
                prev = s[i]
            }
        }
        return "${count / 2 + count % 2}"
    }
}
