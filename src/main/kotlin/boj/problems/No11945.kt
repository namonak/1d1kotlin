package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11945.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No11945 {
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
