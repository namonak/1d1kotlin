package boj.problems

import java.io.BufferedReader

class No1037 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }
        val max = numbers.maxOrNull() ?: 0
        val min = numbers.minOrNull() ?: 0

        return (max * min).toString()
    }
}
