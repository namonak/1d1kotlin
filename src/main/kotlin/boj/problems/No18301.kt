package boj.problems

import java.io.BufferedReader

class No18301 {
    fun solve(input: BufferedReader): String {
        val (n1, n2, n12) = input.readLine().split(" ").map { it.toInt() }
        return ((n1 + 1) * (n2 + 1) / (n12 + 1) - 1).toString()
    }
}
