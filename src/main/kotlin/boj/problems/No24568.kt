package boj.problems

import java.io.BufferedReader

class No24568 {
    fun solve(input: BufferedReader): String {
        val r = input.readLine().toInt()
        val s = input.readLine().toInt()
        val totalCupcakes = r * 8 + s * 3
        val leftover = totalCupcakes - 28
        return leftover.toString()
    }
}
