package boj.problems

import java.io.BufferedReader

class No11931 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = mutableListOf<Int>()
        repeat(n) {
            numbers.add(input.readLine().toInt())
        }
        return numbers.sortedDescending().joinToString("\n")
    }
}
