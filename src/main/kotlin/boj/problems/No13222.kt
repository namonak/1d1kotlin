package boj.problems

import java.io.BufferedReader

class No13222 {
    fun solve(input: BufferedReader): String {
        val (n, w, h) = input.readLine().split(" ").map { it.toInt() }
        val result = StringBuilder()

        repeat(n) {
            val length = input.readLine().toInt()
            result.append(
                if (length * length <= w * w + h * h) "YES\n"
                else "NO\n"
            )
        }

        return result.toString().trimEnd()
    }
}
