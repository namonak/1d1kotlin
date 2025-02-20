package boj.problems

import java.io.BufferedReader

class No10823 {
    fun solve(input: BufferedReader): String {
        val mergedString = input.readLines().joinToString("")

        val numbers = Regex("\\d+").findAll(mergedString)
            .map { it.value.toInt() }
            .sum()

        return numbers.toString()
    }
}
