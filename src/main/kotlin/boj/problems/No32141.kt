package boj.problems

import java.io.BufferedReader

class No32141 {
    fun solve(input: BufferedReader): String {
        val (_, h) = input.readLine().split(" ").map { it.toInt() }
        val cards = input.readLine().split(" ").map { it.toLong() }

        var sum = 0L
        for (i in cards.indices) {
            sum += cards[i]
            if (sum >= h) {
                return (i + 1).toString()
            }
        }

        return "-1"
    }
}
