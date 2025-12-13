package boj.problems

import java.io.BufferedReader

class No25625 {
    fun solve(input: BufferedReader): String {
        val (x, y) = input.readLine().split(" ").map { it.toInt() }

        val waitTime = if (y < x) {
            y + x
        } else {
            y - x
        }

        return waitTime.toString()
    }
}
