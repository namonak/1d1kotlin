package boj.problems

import java.io.BufferedReader

object No1260 {
    fun solve(input: BufferedReader): String {
        val (n, m, v) = input.readLine().split(" ").map { it.toInt() }
        val graph = Array(n + 1) { mutableListOf<Int>() }
        repeat(m) {
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            graph[a].add(b)
            graph[b].add(a)
        }
        graph.forEach { it.sort() }
        return dfs(graph, v) + "\n" + bfs(graph, v)
    }

    private fun dfs(graph: Array<MutableList<Int>>, v: Int): String {
        val visited = BooleanArray(graph.size)
        val stack = mutableListOf<Int>()
        val result = mutableListOf<Int>()
        stack.add(v)
        while (stack.isNotEmpty()) {
            val current = stack.removeLast()
            if (!visited[current]) {
                visited[current] = true
                result.add(current)
                stack.addAll(graph[current].reversed())
            }
        }
        return result.joinToString(" ")
    }

    private fun bfs(graph: Array<MutableList<Int>>, v: Int): String {
        val visited = BooleanArray(graph.size)
        val queue = mutableListOf<Int>()
        val result = mutableListOf<Int>()
        queue.add(v)
        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            if (!visited[current]) {
                visited[current] = true
                result.add(current)
                queue.addAll(graph[current])
            }
        }
        return result.joinToString(" ")
    }
}
