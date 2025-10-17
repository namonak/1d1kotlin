package boj.problems

import java.io.BufferedReader

private const val HOURS_IN_A_DAY = 24

class No22864 {
    fun solve(input: BufferedReader): String {
        val (a, b, c, m) = input.readLine().split(" ").map { it.toInt() }
        var totalFatigue = 0
        var totalWorkLoad = 0

        repeat(HOURS_IN_A_DAY) {
            if (totalFatigue + a <= m) {
                totalFatigue += a
                totalWorkLoad += b
            } else {
                totalFatigue = (totalFatigue - c).coerceAtLeast(0)
            }
        }

        return totalWorkLoad.toString()
    }
}
