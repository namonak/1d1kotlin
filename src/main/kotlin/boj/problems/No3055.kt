package boj.problems

import java.io.BufferedReader
import java.util.LinkedList
import java.util.Queue

class No3055 {
    private data class Point(val x: Int, val y: Int)

    private val directions = listOf(
        Point(-1, 0),
        Point(1, 0),
        Point(0, -1),
        Point(0, 1)
    )

    private lateinit var map: Array<CharArray>
    private lateinit var visited: Array<BooleanArray>
    private val waterQueue: Queue<Point> = LinkedList()
    private val hedgehogQueue: Queue<Point> = LinkedList()
    private var destination: Point? = null
    private var row = 0
    private var col = 0

    fun solve(input: BufferedReader): String {
        parseInput(input)
        initializeQueues()
        val result = simulateEscape()
        return result ?: "KAKTUS"
    }

    private fun parseInput(input: BufferedReader) {
        val (r, c) = input.readLine().split(" ").map { it.toInt() }
        row = r
        col = c
        map = Array(row) { input.readLine().toCharArray() }
        visited = Array(row) { BooleanArray(col) { false } }
    }

    private fun initializeQueues() {
        repeat(row) { x ->
            repeat(col) { y ->
                when (map[x][y]) {
                    'S' -> {
                        hedgehogQueue.add(Point(x, y))
                        visited[x][y] = true
                    }
                    '*' -> waterQueue.add(Point(x, y))
                    'D' -> destination = Point(x, y)
                }
            }
        }
    }

    private fun simulateEscape(): String? {
        var time = 0
        while (hedgehogQueue.isNotEmpty()) {
            time++
            spreadWater()

            if (moveHedgehog()) {
                return time.toString()
            }
        }
        return null
    }

    private fun spreadWater() {
        repeat(waterQueue.size) {
            val (x, y) = waterQueue.poll()
            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy
                if (nx in 0 until row && ny in 0 until col && map[nx][ny] == '.') {
                    map[nx][ny] = '*'
                    waterQueue.add(Point(nx, ny))
                }
            }
        }
    }

    private fun moveHedgehog(): Boolean {
        repeat(hedgehogQueue.size) {
            val (x, y) = hedgehogQueue.poll()
            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy
                if (nx !in 0 until row || ny !in 0 until col || visited[nx][ny]) continue

                when (map[nx][ny]) {
                    '.' -> {
                        visited[nx][ny] = true
                        hedgehogQueue.add(Point(nx, ny))
                    }
                    'D' -> return true
                }
            }
        }

        return false
    }
}
