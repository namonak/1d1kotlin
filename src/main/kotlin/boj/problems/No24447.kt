package boj.problems

import java.io.BufferedReader

class No24447 {
    private var orderCounter = 1

    fun solve(input: BufferedReader): String {
        val (n, m, start) = input.readLine().split(" ").map { it.toInt() }
        val graph = Array(n + 1) { mutableListOf<Int>() }
        val visited = Array(n + 1) { false }
        val depth = IntArray(n + 1) { -1 }
        val order = IntArray(n + 1) { 0 }

        repeat(m) {
            val (u, v) = input.readLine().split(" ").map { it.toInt() }
            graph[u].add(v)
            graph[v].add(u)
        }

        for (i in 1..n) {
            graph[i].sort()
        }

        bfs(graph, visited, start, order, depth)

        var resultSum = 0L
        for (i in 1..n) {
            resultSum += depth[i].toLong() * order[i]
        }

        return resultSum.toString()
    }

    private fun bfs(
        graph: Array<MutableList<Int>>,
        visited: Array<Boolean>,
        start: Int,
        order: IntArray,
        depth: IntArray
    ) {
        val queue = ArrayDeque<Int>()

        visited[start] = true
        depth[start] = 0
        queue.add(start)

        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            order[node] = orderCounter++

            for (neighbor in graph[node]) {
                if (visited[neighbor]) continue

                visited[neighbor] = true
                depth[neighbor] = depth[node] + 1
                queue.add(neighbor)
            }
        }
    }
}
