package boj.problems

import java.io.BufferedReader

class No20499 {
    fun solve(input: BufferedReader): String {
        val (k, d, a) = input.readLine().split("/").map { it.toInt() }
        return if (k + a < d || d == 0) "hasu" else "gosu"
    }
}
