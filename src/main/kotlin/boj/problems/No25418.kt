package boj.problems

import java.io.BufferedReader
import java.util.LinkedList
import java.util.Queue

class No25418 {
    fun solve(input: BufferedReader): String {
        val (a, k) = input.readLine().split(" ").map { it.toInt() }
        return "${bfs(a, k)}"
    }

    private fun bfs(a: Int, k: Int): Int {
        val visited = IntArray(k + 1) { -1 }
        val queue: Queue<Int> = LinkedList()

        queue.add(a)
        visited[a] = 0

        while (queue.isNotEmpty()) {
            val current = queue.poll()

            if (current == k) {
                return visited[current]
            }

            if (current + 1 <= k && visited[current + 1] == -1) {
                queue.add(current + 1)
                visited[current + 1] = visited[current] + 1
            }
            if (current * 2 <= k && visited[current * 2] == -1) {
                queue.add(current * 2)
                visited[current * 2] = visited[current] + 1
            }
        }

        return -1
    }
}
