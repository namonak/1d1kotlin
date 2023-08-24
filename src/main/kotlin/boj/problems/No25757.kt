package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No25757.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No25757 {
    fun solve(input: BufferedReader): Int {
        val (n, gameType) = input.readLine().split(" ")
        val players = HashSet<String>()

        repeat(n.toInt()) {
            players.add(input.readLine())
        }

        return when (gameType) {
            "Y" -> (players.size / 1)
            "F" -> (players.size / 2)
            "O" -> (players.size / 3)
            else -> throw IllegalArgumentException()
        }
    }
}
