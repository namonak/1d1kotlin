package boj.problems

import java.io.BufferedReader

object No28014 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val spires = input.readLine().split(" ").map { it.toInt() }
        var pushes = 1

        for (i in 1 until spires.size) {
            if (spires[i - 1] <= spires[i]) {
                pushes++
            }
        }

        return pushes.toString()
    }
}
