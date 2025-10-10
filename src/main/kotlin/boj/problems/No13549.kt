package boj.problems

import java.io.BufferedReader
import kotlin.collections.ArrayDeque

class No13549 {
    private val maxInputNumber = 100000

    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        return findShortestTime(n, k).toString()
    }

    private fun findShortestTime(
        n: Int,
        k: Int
    ): Int {
        if (n >= k) {
            return n - k
        }

        val visited = IntArray(maxInputNumber + 1) { -1 }
        val deque = ArrayDeque<Int>()

        deque.add(n)
        visited[n] = 0

        while (deque.isNotEmpty()) {
            val current = deque.removeFirstOrNull() ?: continue

            if (current == k) {
                return visited[current]
            }

            val nextPositions = listOf(current - 1, current + 1, current * 2)
            for (next in nextPositions) {
                if (next in 0..maxInputNumber && visited[next] == -1) {
                    if (next == current * 2) {
                        deque.addFirst(next)
                        visited[next] = visited[current]
                    } else {
                        deque.addLast(next)
                        visited[next] = visited[current] + 1
                    }
                }
            }
        }

        return -1
    }
}
