package boj.problems

import java.io.BufferedReader

object No16486 {
    fun solve(input: BufferedReader): String {
        val pi = 3.141592
        val a = input.readLine().toInt()
        val b = input.readLine().toInt()
        return ((a * 2) + (b * 2 * pi)).toString()
    }
}
