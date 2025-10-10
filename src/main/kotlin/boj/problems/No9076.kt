package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No9076.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No9076 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = mutableListOf<String>()

        repeat(t) {
            val score = input.readLine().split(" ").map { it.toInt() }.sorted()
            val trimmedScored = score.drop(1).dropLast(1)
            val min = trimmedScored.first()
            val max = trimmedScored.last()

            if (max - min >= 4) {
                result.add("KIN")
            } else {
                result.add(trimmedScored.sum().toString())
            }
        }

        return result.joinToString("\n")
    }
}
