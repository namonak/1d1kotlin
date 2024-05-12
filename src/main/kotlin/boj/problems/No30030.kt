package boj.problems

import java.io.BufferedReader

class No30030 {
    fun solve(input: BufferedReader): String {
        val b = input.readLine().toInt()
        val a = Math.round(b / 1.1)
        val roundedA = (a / 100) * 100

        return roundedA.toString()
    }
}
