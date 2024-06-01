package boj.problems

import java.io.BufferedReader

class No19564 {
    fun solve(input: BufferedReader): String {
        val given = input.readLine()
        var count = 1
        var prev = given[0]
        for (i in 1 until given.length) {
            if (prev >= given[i]) {
                count++
            }
            prev = given[i]
        }
        return count.toString()
    }
}
