package boj.problems

import java.io.BufferedReader

class No9076 {
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
