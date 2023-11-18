package boj.problems

import java.io.BufferedReader

object No1475 {
    fun solve(input: BufferedReader): String {
        val numbers = input.readLine()
        val count = IntArray(10)
        numbers.forEach { count[it - '0']++ }
        count[6] = (count[6] + count[9] + 1) / 2
        count[9] = 0
        return count.maxOrNull().toString()
    }
}
