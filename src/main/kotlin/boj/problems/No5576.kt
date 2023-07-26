package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No5576.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No5576 {
    fun solve(input: BufferedReader): String {
        val w = IntArray(10) { input.readLine().toInt() }.sortedDescending().take(3).sum()
        val k = IntArray(10) { input.readLine().toInt() }.sortedDescending().take(3).sum()

        return "$w $k"
    }
}
