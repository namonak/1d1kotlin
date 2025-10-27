package boj.problems

import java.io.BufferedReader
import kotlin.math.max

class No2484 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var maxPrize = 0

        repeat(n) {
            val rolls = input.readLine().split(" ").map { it.toInt() }
            val currentPrize = calculatePrize(rolls)

            maxPrize = max(maxPrize, currentPrize)
        }

        return maxPrize.toString()
    }

    private fun calculatePrize(rolls: List<Int>): Int {
        val counts = rolls.groupingBy { it }.eachCount()

        return when {
            counts.containsValue(4) -> {
                val number = counts.keys.first()
                50000 + number * 5000
            }
            counts.containsValue(3) -> {
                val number = counts.filterValues { it == 3 }.keys.first()
                10000 + number * 1000
            }
            counts.size == 2 -> {
                val (n1, n2) = counts.keys.toList()
                2000 + n1 * 500 + n2 * 500
            }
            counts.containsValue(2) -> {
                val number = counts.filterValues { it == 2 }.keys.first()
                1000 + number * 100
            }
            else -> {
                rolls.maxOrNull()!! * 100
            }
        }
    }
}
