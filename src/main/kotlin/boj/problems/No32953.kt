package boj.problems

import java.io.BufferedReader

class No32953 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val attendanceCount = mutableMapOf<String, Int>()

        repeat(n) {
            input.readLine()
            val studentIds = input.readLine().split(" ")

            studentIds.forEach {
                attendanceCount[it] = attendanceCount.getOrDefault(it, 0) + 1
            }
        }

        val result = attendanceCount.values.count { it >= m }
        return result.toString()
    }
}
