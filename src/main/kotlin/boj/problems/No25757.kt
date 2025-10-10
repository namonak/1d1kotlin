package boj.problems

import java.io.BufferedReader

class No25757 {
    fun solve(input: BufferedReader): String {
        val (n, gameType) = input.readLine().split(" ")
        val players = HashSet<String>()

        repeat(n.toInt()) {
            players.add(input.readLine())
        }

        val divisor = when (gameType) {
            "Y" -> 1
            "F" -> 2
            "O" -> 3
            else -> throw IllegalArgumentException()
        }

        return (players.size / divisor).toString()
    }
}
