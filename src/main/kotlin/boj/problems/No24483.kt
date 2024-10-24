package boj.problems

import java.io.BufferedReader

class No24483 {
    fun solve(input: BufferedReader): String {
        val (n, m, start) = input.readLine().split(" ").map { it.toInt() }
        val graph = initializeGraph(n, m, input)
        val dfsResult = performDFS(graph, start)

        return calculateResult(dfsResult.depth, dfsResult.order)
    }

    private fun initializeGraph(n: Int, m: Int, input: BufferedReader): Array<MutableList<Int>> {
        val graph = Array(n + 1) { mutableListOf<Int>() }

        repeat(m) {
            val (u, v) = input.readLine().split(" ").map { it.toInt() }
            graph[u].add(v)
            graph[v].add(u)
        }
        graph.forEach { it.sort() }
        return graph
    }

    private fun performDFS(graph: Array<MutableList<Int>>, start: Int): DFSResult {
        val visited = BooleanArray(graph.size) { false }
        val depth = IntArray(graph.size) { -1 }
        val order = IntArray(graph.size) { 0 }
        var orderCounter = 1

        fun dfs(node: Int) {
            visited[node] = true
            order[node] = orderCounter++
            for (neighbor in graph[node]) {
                if (!visited[neighbor]) {
                    depth[neighbor] = depth[node] + 1
                    dfs(neighbor)
                }
            }
        }

        depth[start] = 0
        dfs(start)

        return DFSResult(depth, order)
    }

    private fun calculateResult(depth: IntArray, order: IntArray): String {
        return (1 until depth.size).sumOf { depth[it].toLong() * order[it] }.toString()
    }

    private data class DFSResult(val depth: IntArray, val order: IntArray)
}
