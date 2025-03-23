package boj.problems

import java.io.BufferedReader

class No30009 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val (x, _, r) = input.readLine().split(" ").map { it.toInt() }

        val lines = List(n) { input.readLine().toInt() }

        var insideCount = 0
        var boundaryCount = 0

        for (ti in lines) {
            val distance = kotlin.math.abs(ti - x)

            when {
                distance < r -> insideCount++
                distance == r -> boundaryCount++
            }
        }

        return "$insideCount $boundaryCount"
    }
}
