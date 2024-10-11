package boj.problems

import java.io.BufferedReader

class No19602 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine().toInt()
        val m = input.readLine().toInt()
        val l = input.readLine().toInt()

        return if (s + 2 * m + 3 * l >= 10) "happy" else "sad"
    }
}
