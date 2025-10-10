package boj.problems

import java.io.BufferedReader

class No5014 {
    fun solve(input: BufferedReader): String {
        val (f, s, g, u, d) = input.readLine().split(" ").map { it.toInt() }
        return bfs(f, s, g, u, d)
    }

    private fun bfs(
        f: Int,
        s: Int,
        g: Int,
        u: Int,
        d: Int
    ): String {
        val visited = BooleanArray(f + 1)
        val queue = mutableListOf(s)
        visited[s] = true

        var count = 0
        while (queue.isNotEmpty()) {
            val size = queue.size
            repeat(size) {
                val current = queue.removeFirst()

                if (current == g) {
                    return "$count"
                }

                if (current + u <= f && !visited[current + u]) {
                    queue.add(current + u)
                    visited[current + u] = true
                }
                if (current - d >= 1 && !visited[current - d]) {
                    queue.add(current - d)
                    visited[current - d] = true
                }
            }
            count++
        }

        return "use the stairs"
    }
}
