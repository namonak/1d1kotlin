package boj.problems

import java.io.BufferedReader

class No11945 {
    fun solve(input: BufferedReader): String {
        val (n, _) = input.readLine().split(" ").map { it.toInt() }
        val stringBuilder = StringBuilder()

        repeat(n) {
            stringBuilder.append(input.readLine().reversed())
            stringBuilder.append("\n")
        }

        return stringBuilder.toString().trimEnd()
    }
}
