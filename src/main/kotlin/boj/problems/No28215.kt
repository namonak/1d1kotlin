package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No28215 {
    data class House(val x: Int, val y: Int)

    fun solve(input: BufferedReader): String {
        val (houses, k) = parseInput(input)
        val dist = buildDistanceMatrix(houses)
        val answer = findMinWorstDistance(dist, k)
        return answer.toString()
    }

    private fun parseInput(input: BufferedReader): Pair<List<House>, Int> {
        val (n, k) = input.readLine().split(" ").map(String::toInt)
        val houses = List(n) {
            input.readLine().split(" ").let { (x, y) -> House(x.toInt(), y.toInt()) }
        }
        return houses to k
    }

    private fun buildDistanceMatrix(houses: List<House>): Array<IntArray> {
        val n = houses.size
        return Array(n) { i ->
            IntArray(n) { j -> manhattanDistance(houses[i], houses[j]) }
        }
    }

    private fun manhattanDistance(a: House, b: House): Int {
        return abs(a.x - b.x) + abs(a.y - b.y)
    }

    private fun findMinWorstDistance(dist: Array<IntArray>, k: Int): Int {
        val n = dist.size
        var minWorst = Int.MAX_VALUE
        generateCombinations(n, k).forEach { shelters ->
            val worst = (0 until n).maxOf { i ->
                shelters.minOf { s -> dist[i][s] }
            }
            minWorst = minOf(minWorst, worst)
        }
        return minWorst
    }

    private fun generateCombinations(n: Int, k: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        fun dfs(start: Int, depth: Int, current: MutableList<Int>) {
            if (depth == k) {
                result.add(current.toList())
                return
            }
            for (i in start until n) {
                current.add(i)
                dfs(i + 1, depth + 1, current)
                current.removeAt(current.lastIndex)
            }
        }
        dfs(0, 0, mutableListOf())
        return result
    }
}
