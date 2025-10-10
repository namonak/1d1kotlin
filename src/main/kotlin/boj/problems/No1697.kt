package boj.problems

import java.io.BufferedReader
import java.util.LinkedList
import java.util.Queue

class No1697 {
    private val maxInputNumber = 100000

    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        return "${bfs(n, k)}"
    }

    private fun bfs(
        n: Int,
        k: Int
    ): Int {
        val visited = IntArray(maxInputNumber + 1) { -1 }
        val queue: Queue<Int> = LinkedList()

        queue.add(n)
        visited[n] = 0

        while (queue.isNotEmpty()) {
            val current = queue.poll()

            if (current == k) {
                return visited[current]
            }

            val nextPositions = listOf(current - 1, current + 1, current * 2)
            for (next in nextPositions) {
                if (next in 0..maxInputNumber && visited[next] == -1) {
                    queue.add(next)
                    visited[next] = visited[current] + 1
                }
            }
        }

        return -1
    }
}
