package boj.problems

import java.io.BufferedReader

class No6013 {
    data class Cow(val x: Int, val y: Int) {
        fun distance(other: Cow): Int {
            return (x - other.x).let { it * it } + (y - other.y).let { it * it }
        }
    }

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val cows = List(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            Cow(x, y)
        }

        var maxDist = -1.0
        var cowA = 0
        var cowB = 0

        for (i in 0 until n) {
            for (j in i + 1 until n) {
                val dist = cows[i].distance(cows[j])
                if (dist > maxDist) {
                    maxDist = dist.toDouble()
                    cowA = i + 1
                    cowB = j + 1
                }
            }
        }

        val (a, b) = listOf(cowA, cowB).sorted()
        return "$a $b"
    }
}
