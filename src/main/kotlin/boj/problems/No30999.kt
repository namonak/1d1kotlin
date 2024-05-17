package boj.problems

import java.io.BufferedReader

class No30999 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val majority = (m / 2) + 1
        var count = 0

        repeat(n) {
            val votes = input.readLine()
            val approvalCount = votes.count { it == 'O' }

            if (approvalCount >= majority) {
                count += 1
            }
        }

        return count.toString()
    }
}
