package boj.problems

import java.io.BufferedReader

class No11725 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val graph = Array(n + 1) { mutableListOf<Int>() }
        val visited = BooleanArray(n + 1) { false }
        val parent = IntArray(n + 1) { 0 }

        repeat(n - 1) {
            val (u, v) = input.readLine().split(" ").map { it.toInt() }
            graph[u].add(v)
            graph[v].add(u)
        }

        dfsRecursive(graph, visited, 1, parent)

        return parent.slice(2..n).joinToString("\n")
    }

    private fun dfsRecursive(
        graph: Array<MutableList<Int>>,
        visited: BooleanArray,
        node: Int,
        parent: IntArray
    ) {
        visited[node] = true

        for (neighbor in graph[node]) {
            if (!visited[neighbor]) {
                parent[neighbor] = node
                dfsRecursive(graph, visited, neighbor, parent)
            }
        }
    }
}
