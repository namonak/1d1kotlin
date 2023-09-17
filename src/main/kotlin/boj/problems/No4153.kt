package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No4153.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No4153 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        while (true) {
            val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
            if (a == 0 && b == 0 && c == 0) break
            result.append(
                when {
                    a * a + b * b == c * c -> "right"
                    a * a + c * c == b * b -> "right"
                    b * b + c * c == a * a -> "right"
                    else -> "wrong"
                }
            ).append("\n")
        }
        return result.toString().trimEnd()
    }
}
