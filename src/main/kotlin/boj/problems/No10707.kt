package boj.problems

import java.io.BufferedReader

class No10707 {
    fun solve(input: BufferedReader): String {
        val x = input.readLine().toInt()
        val y = input.readLine().toInt()
        val yLimit = input.readLine().toInt()
        val yExtra = input.readLine().toInt()
        val p = input.readLine().toInt()

        val a = x * p
        val b = if (p > yLimit) {
            y + (p - yLimit) * yExtra
        } else {
            y
        }

        return minOf(a, b).toString()
    }
}
