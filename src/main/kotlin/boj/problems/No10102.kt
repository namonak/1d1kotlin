package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10102.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No10102 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val votes = input.readLine()

        val a = votes.count { it == 'A' }
        val b = votes.count { it == 'B' }

        return when {
            a > b -> "A"
            a < b -> "B"
            else -> "Tie"
        }
    }
}
