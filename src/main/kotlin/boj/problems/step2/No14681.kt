package boj.problems.step2

import java.io.BufferedReader

class No14681 {
    fun solve(input: BufferedReader): String {
        val x = input.readLine().toInt()
        val y = input.readLine().toInt()

        return Coordinates(x, y).getQuadrant().toString()
    }
}

class Coordinates(private val x: Int, private val y: Int) {
    fun getQuadrant(): Int {
        return when {
            x > 0 && y > 0 -> 1
            x < 0 && y > 0 -> 2
            x < 0 && y < 0 -> 3
            else -> 4
        }
    }
}
