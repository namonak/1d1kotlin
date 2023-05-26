package boj.problems.step13

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11651.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No11651 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val points = mutableListOf<Pair<Int, Int>>()

        repeat(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            points.add(Pair(x, y))
        }

        points.sortWith(compareBy({ it.second }, { it.first }))

        val sb = StringBuilder()

        points.forEach {
            sb.append("${it.first} ${it.second}\n")
        }

        return sb.toString().trimEnd()
    }
}
