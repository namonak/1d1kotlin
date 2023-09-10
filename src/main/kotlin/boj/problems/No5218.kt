package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No5218.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No5218 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = mutableListOf<String>()

        repeat(n) {
            val (a, b) = input.readLine().split(" ")
            val distances = a.zip(b).map { (x, y) ->
                if (x <= y) y - x else y - x + 26
            }
            result.add("Distances: ${distances.joinToString(" ")}")
        }

        return result.joinToString("\n")
    }
}
