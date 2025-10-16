package boj.problems

import java.io.BufferedReader

class No5576 {
    fun solve(input: BufferedReader): String {
        val w = IntArray(10) { input.readLine().toInt() }.sortedDescending().take(3).sum()
        val k = IntArray(10) { input.readLine().toInt() }.sortedDescending().take(3).sum()

        return "$w $k"
    }
}
