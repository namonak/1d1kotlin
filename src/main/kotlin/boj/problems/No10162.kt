package boj.problems

import java.io.BufferedReader

object No10162 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val a = 300
        val b = 60
        val c = 10
        val result = mutableListOf(0, 0, 0)
        if (t % c != 0) {
            return "-1"
        }
        result[0] = t / a
        result[1] = (t % a) / b
        result[2] = (t % a % b) / c
        return result.joinToString(" ")
    }
}
