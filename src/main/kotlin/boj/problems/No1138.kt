package boj.problems

import java.io.BufferedReader

class No1138 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val leftTallCount = input.readLine().split(" ").map { it.toInt() }
        val line = MutableList(n) { 0 }

        for (height in 1..n) {
            var count = leftTallCount[height - 1]
            for (i in 0 until n) {
                if (line[i] == 0) {
                    if (count == 0) {
                        line[i] = height
                        break
                    }
                    count--
                }
            }
        }

        return line.joinToString(" ")
    }
}
