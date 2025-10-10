package boj.problems

import java.io.BufferedReader

class No11724 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val graph = Array(n + 1) { mutableListOf<Int>() }
        var count = 0

        repeat(m) {
            val (u, v) = input.readLine().split(" ").map { it.toInt() }
            graph[u].add(v)
            graph[v].add(u)
        }

        val visited = BooleanArray(n + 1)
        for (i in 1..n) {
            if (!visited[i]) {
                dfs(i, graph, visited)
                count++
            }
        }

        return count.toString()
    }

    private fun dfs(
        v: Int,
        graph: Array<MutableList<Int>>,
        visited: BooleanArray
    ) {
        visited[v] = true
        for (i in graph[v]) {
            if (!visited[i]) {
                dfs(i, graph, visited)
            }
        }
    }
}
