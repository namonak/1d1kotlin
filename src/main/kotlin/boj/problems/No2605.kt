package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2605.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No2605 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine().toInt()
        val students = input.readLine().split(" ").map { it.toInt() }
        val line = mutableListOf<Int>()
        for (i in 0 until number) {
            line.add(i - students[i], i + 1)
        }
        return line.joinToString(" ")
    }
}
