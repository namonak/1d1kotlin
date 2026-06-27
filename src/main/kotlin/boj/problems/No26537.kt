package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No26537 {
    data class Point(val x: Int, val y: Int) : Comparable<Point> {
        override fun compareTo(other: Point): Int {
            return compareValuesBy(this, other, Point::x, Point::y)
        }
    }

    private val pairComparator = compareBy<Pair<Point, Point>> { it.first }.thenBy { it.second }

    private fun squaredDistance(
        p1: Point,
        p2: Point
    ): Long {
        val dx = (p1.x - p2.x).toLong()
        val dy = (p1.y - p2.y).toLong()
        return dx * dx + dy * dy
    }

    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        return List(testCaseCount) {
            findClosestPair(readAnimals(input))?.format() ?: ""
        }.joinToString("\n")
    }

    private fun readAnimals(input: BufferedReader): List<Point> {
        val animalCount = input.readLine().toInt()
        return List(animalCount) {
            val tokenizer = StringTokenizer(input.readLine())
            Point(tokenizer.nextToken().toInt(), tokenizer.nextToken().toInt())
        }
    }

    private fun findClosestPair(animals: List<Point>): Pair<Point, Point>? {
        var minDistance = Long.MAX_VALUE
        var closestPair: Pair<Point, Point>? = null

        for (i in 0 until animals.lastIndex) {
            for (j in i + 1..animals.lastIndex) {
                val candidatePair = orderedPair(animals[i], animals[j])
                val currentDistance = squaredDistance(candidatePair.first, candidatePair.second)
                if (shouldReplacePair(currentDistance, minDistance, candidatePair, closestPair)) {
                    minDistance = currentDistance
                    closestPair = candidatePair
                }
            }
        }

        return closestPair
    }

    private fun orderedPair(
        p1: Point,
        p2: Point
    ): Pair<Point, Point> {
        return if (p1 < p2) {
            Pair(p1, p2)
        } else {
            Pair(p2, p1)
        }
    }

    private fun shouldReplacePair(
        currentDistance: Long,
        minDistance: Long,
        candidatePair: Pair<Point, Point>,
        closestPair: Pair<Point, Point>?
    ): Boolean {
        if (currentDistance < minDistance) return true
        if (currentDistance > minDistance) return false
        return closestPair == null || pairComparator.compare(candidatePair, closestPair) < 0
    }

    private fun Pair<Point, Point>.format(): String {
        return "${first.x} ${first.y} ${second.x} ${second.y}"
    }
}
