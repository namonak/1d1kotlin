package boj.problems

import java.io.BufferedReader

class No15781 {
    fun solve(input: BufferedReader): String {
        val (_, _) = input.readLine().split(" ").map { it.toInt() }
        val helmets = input.readLine().split(" ").map { it.toInt() }
        val vests = input.readLine().split(" ").map { it.toInt() }

        val maxHelmet = helmets.maxOrNull() ?: 0
        val maxVest = vests.maxOrNull() ?: 0

        return (maxHelmet + maxVest).toString()
    }
}
