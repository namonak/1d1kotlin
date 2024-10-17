package boj.problems

import java.io.BufferedReader
import kotlin.math.pow
import kotlin.math.sqrt

class No17286 {
    data class Point(val x: Int, val y: Int)

    fun solve(input: BufferedReader): String {
        val points = Array(4) { input.readLine().split(" ").let { Point(it[0].toInt(), it[1].toInt()) } }
        val yumi = points[0]
        val result = mutableListOf<Double>()

        val permutations = mutableListOf<IntArray>()
        generatePermutations(3, BooleanArray(3), IntArray(3), permutations)

        permutations.forEach { permutation ->
            var distance = 0.0
            var currentPosition = yumi

            for (index in permutation) {
                distance += calculateDistance(currentPosition, points[index])
                currentPosition = points[index]
            }
            result.add(distance)
        }

        return result.minOrNull()?.toInt().toString()
    }

    private fun generatePermutations(n: Int, visited: BooleanArray, arr: IntArray, permutations: MutableList<IntArray>, depth: Int = 0) {
        if (depth == n) {
            permutations.add(arr.copyOf())
            return
        }

        for (i in 0 until n) {
            if (visited[i]) continue

            visited[i] = true
            arr[depth] = i + 1
            generatePermutations(n, visited, arr, permutations, depth + 1)
            visited[i] = false
        }
    }

    private fun calculateDistance(p1: Point, p2: Point): Double {
        return sqrt((p1.x - p2.x).toDouble().pow(2.0) + (p1.y - p2.y).toDouble().pow(2.0))
    }
}
