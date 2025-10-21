package boj.problems

import java.io.BufferedReader

class No2460 {
    fun solve(input: BufferedReader): String {
        var max = 0
        var current = 0

        repeat(10) {
            val (off, on) = input.readLine().split(" ").map { it.toInt() }
            current += on - off
            if (current > max) max = current
        }

        return max.toString()
    }
}
