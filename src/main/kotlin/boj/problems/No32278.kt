package boj.problems

import java.io.BufferedReader

class No32278 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()

        return when (n) {
            in Short.MIN_VALUE..Short.MAX_VALUE -> "short"
            in Int.MIN_VALUE..Int.MAX_VALUE -> "int"
            else -> "long long"
        }
    }
}
