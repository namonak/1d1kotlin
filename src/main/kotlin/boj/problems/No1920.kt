package boj.problems

import java.io.BufferedReader

class No1920() {
    fun solve(input: BufferedReader): String {
        input.readLine()
        val numberSet = input.readLine().split(' ').map { it.toInt() }.toSet()

        input.readLine()
        val targets = input.readLine().split(' ').map { it.toInt() }

        return targets.map { if (numberSet.contains(it)) 1 else 0 }
            .joinToString("\n")
    }
}
