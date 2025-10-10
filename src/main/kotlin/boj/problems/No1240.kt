package boj.problems

import java.io.BufferedReader

class No1240 {
    data class Node(val index: Int, val distance: Int)

    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val graph = Array(n + 1) { mutableListOf<Node>() }

        repeat(n - 1) {
            val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
            graph[a].add(Node(b, c))
            graph[b].add(Node(a, c))
        }

        val results = StringBuilder()
        repeat(m) {
            val (start, end) = input.readLine().split(" ").map { it.toInt() }
            results.append(dfs(graph, start, end, BooleanArray(n + 1), 0)).append("\n")
        }

        return results.toString().trim()
    }

    private fun dfs(
        graph: Array<MutableList<Node>>,
        current: Int,
        target: Int,
        visited: BooleanArray,
        distance: Int
    ): Int {
        if (current == target) return distance
        visited[current] = true

        for (node in graph[current]) {
            if (!visited[node.index]) {
                val result = dfs(graph, node.index, target, visited, distance + node.distance)
                if (result != -1) return result
            }
        }

        return -1
    }
}
