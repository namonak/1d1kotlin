package boj.problems

import java.io.BufferedReader

class No2752 {
    fun solve(input: BufferedReader): String {
        val numbers = input.readLine().split(" ").map { it.toInt() }.sorted()
        return numbers.joinToString(" ")
    }
}
