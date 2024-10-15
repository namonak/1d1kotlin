package boj.problems

import java.io.BufferedReader

class No24446 {
    fun solve(input: BufferedReader): String {
        val (n, m, start) = input.readLine().split(" ").map { it.toInt() }
        val graph = Array(n + 1) { mutableListOf<Int>() }
        val visited = BooleanArray(n + 1) { false }
        val depth = IntArray(n + 1) { -1 }

        repeat(m) {
            val (u, v) = input.readLine().split(" ").map { it.toInt() }
            graph[u].add(v)
            graph[v].add(u)
        }

        bfs(graph, visited, start, depth)

        return depth.slice(1..n).joinToString("\n")
    }

    private fun bfs(graph: Array<MutableList<Int>>, visited: BooleanArray, start: Int, depth: IntArray) {
        val queue = ArrayDeque<Int>()

        visited[start] = true
        depth[start] = 0
        queue.add(start)

        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()

            for (neighbor in graph[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true
                    depth[neighbor] = depth[node] + 1
                    queue.add(neighbor)
                }
            }
        }
    }
}
