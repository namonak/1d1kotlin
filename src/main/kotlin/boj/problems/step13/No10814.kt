package boj.problems.step13

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10814.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No10814 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = mutableListOf<Pair<Int, String>>()

        repeat(n) {
            val (age, name) = input.readLine().split(" ")
            result.add(Pair(age.toInt(), name))
        }
        result.sortBy { it.first }

        return result.joinToString("\n") { "${it.first} ${it.second}" }
    }
}
