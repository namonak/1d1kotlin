package boj.problems

import java.io.BufferedReader

class No2865 {
    fun solve(input: BufferedReader): String {
        val (_, m, k) = input.readLine().split(" ").map { it.toInt() }
        val abilities = mutableListOf<Pair<Int, Double>>()

        repeat(m) {
            val tokens = input.readLine().split(" ")
            for (i in tokens.indices step 2) {
                val participant = tokens[i].toInt()
                val score = tokens[i + 1].toDouble()
                abilities.add(participant to score)
            }
        }

        abilities.sortByDescending { it.second }

        val selected = mutableSetOf<Int>()
        var total = 0.0
        var count = 0

        for ((participant, score) in abilities) {
            if (participant !in selected) {
                selected.add(participant)
                total += score
                count++
                if (count == k) break
            }
        }

        return String.format("%.1f", total)
    }
}
