package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No4999.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No4999 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine()
        val b = input.readLine()

        return if (a.length >= b.length) "go" else "no"
    }
}
