package boj.problems

import java.io.BufferedReader

class No21300 {
    fun solve(input: BufferedReader): String {
        val containers = input.readLine().split(" ").map { it.toInt() }
        val totalRefundCents = containers.sum() * 5
        return totalRefundCents.toString()
    }
}
