package boj.problems

import java.io.BufferedReader

class No2476 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var maxPrize = 0

        repeat(n) {
            val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
            val prize = when {
                a == b && b == c -> 10000 + a * 1000
                a == b || a == c -> 1000 + a * 100
                b == c -> 1000 + b * 100
                else -> maxOf(a, b, c) * 100
            }
            if (prize > maxPrize) maxPrize = prize
        }

        return "$maxPrize"
    }
}
