package boj.problems

import java.io.BufferedReader

class No15953 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            val prize2017 = getPrize2017(a)
            val prize2018 = getPrize2018(b)
            val totalPrize = (prize2017 + prize2018) * 10_000
            result.append(totalPrize).append("\n")
        }

        return result.toString().trimEnd()
    }

    private fun getPrize2017(rank: Int): Int {
        if (rank == 0) return 0
        return when (rank) {
            1 -> 500
            in 2..3 -> 300
            in 4..6 -> 200
            in 7..10 -> 50
            in 11..15 -> 30
            in 16..21 -> 10
            else -> 0
        }
    }

    private fun getPrize2018(rank: Int): Int {
        if (rank == 0) return 0
        return when (rank) {
            1 -> 512
            in 2..3 -> 256
            in 4..7 -> 128
            in 8..15 -> 64
            in 16..31 -> 32
            else -> 0
        }
    }
}
