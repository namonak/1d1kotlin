package boj.problems

import java.io.BufferedReader

class No24479 {
    private var orderCounter = 1

    fun solve(input: BufferedReader): String {
        val (n, m, start) = input.readLine().split(" ").map { it.toInt() }
        val graph = Array(n + 1) { mutableListOf<Int>() }
        val visited = BooleanArray(n + 1) { false }
        val order = IntArray(n + 1) { 0 }

        repeat(m) {
            val (u, v) = input.readLine().split(" ").map { it.toInt() }
            graph[u].add(v)
            graph[v].add(u)
        }

        for (i in 1..n) {
            graph[i].sort()
        }

        dfsRecursive(graph, visited, start, order)

        return order.slice(1..n).joinToString("\n")
    }

    private fun dfsRecursive(graph: Array<MutableList<Int>>, visited: BooleanArray, node: Int, order: IntArray) {
        visited[node] = true
        order[node] = orderCounter++

        for (neighbor in graph[node]) {
            if (!visited[neighbor]) {
                dfsRecursive(graph, visited, neighbor, order)
            }
        }
    }
}
