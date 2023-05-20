package boj.problems.step13

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No18870.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No18870 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val number = input.readLine().split(" ").map { it.toInt() }

        val sortedNumber = number.sorted().distinct()
        val map = sortedNumber.mapIndexed { index, i -> i to index }.toMap()

        return number.joinToString(" ") { map[it].toString() }
    }
}
