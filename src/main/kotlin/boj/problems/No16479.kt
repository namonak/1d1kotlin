package boj.problems

import java.io.BufferedReader

class No16479 {
    fun solve(input: BufferedReader): String {
        val k = input.readLine().toInt()
        val (a, b) = input.readLine().split(" ").map { it.toInt() }
        return if (a == b) {
            (k * k).toString()
        } else {
            val h = (a - b) / 2.0
            (k * k - h * h).toString()
        }
    }
}
