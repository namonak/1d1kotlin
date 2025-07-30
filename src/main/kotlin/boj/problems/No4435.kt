package boj.problems

import java.io.BufferedReader

class No4435 {
    fun solve(input: BufferedReader): String {
        val goodPoints = listOf(1, 2, 3, 3, 4, 10)
        val evilPoints = listOf(1, 2, 2, 2, 3, 5, 10)

        val result = buildString {
            val battleCount = input.readLine().toInt()
            repeat(battleCount) { index ->
                val goodArmy = input.readLine().split(" ").map { it.toInt() }
                val evilArmy = input.readLine().split(" ").map { it.toInt() }

                val goodTotal = goodArmy.zip(goodPoints).sumOf { (count, point) -> count * point }
                val evilTotal = evilArmy.zip(evilPoints).sumOf { (count, point) -> count * point }

                val outcome = when {
                    goodTotal > evilTotal -> "Good triumphs over Evil"
                    goodTotal < evilTotal -> "Evil eradicates all trace of Good"
                    else -> "No victor on this battle field"
                }

                appendLine("Battle ${index + 1}: $outcome")
            }
        }

        return result.trimEnd()
    }
}
