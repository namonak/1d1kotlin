package boj.problems

import java.io.BufferedReader

class No10867 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }.sorted().distinct()

        return numbers.joinToString(" ")
    }
}
