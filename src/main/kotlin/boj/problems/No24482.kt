package boj.problems

import java.io.BufferedReader

class No24482 {
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

        for (i in 1..n) {
            graph[i].sortDescending()
        }

        depth[start] = 0

        dfsRecursive(graph, visited, start, depth)

        return depth.slice(1..n).joinToString("\n")
    }

    private fun dfsRecursive(graph: Array<MutableList<Int>>, visited: BooleanArray, node: Int, depth: IntArray) {
        visited[node] = true

        for (neighbor in graph[node]) {
            if (visited[neighbor]) continue

            depth[neighbor] = depth[node] + 1
            dfsRecursive(graph, visited, neighbor, depth)
        }
    }
}
