package boj.problems

import java.io.BufferedReader

class No1524 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()

        repeat(t) {
            var line = input.readLine()
            while (line.isBlank()) {
                line = input.readLine()
            }

            val (_, _) = line.split(" ").map { it.toInt() }
            val sejunPowers = input.readLine().split(" ").map { it.toInt() }
            val sebiPowers = input.readLine().split(" ").map { it.toInt() }

            val maxS = sejunPowers.maxOrNull() ?: 0
            val maxB = sebiPowers.maxOrNull() ?: 0

            val result = when {
                maxS > maxB -> "S"
                maxS < maxB -> "B"
                else -> "S"
            }

            sb.append(result).append("\n")
        }

        return sb.toString().trimEnd()
    }
}
