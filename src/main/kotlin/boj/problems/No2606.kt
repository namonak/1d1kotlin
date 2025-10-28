package boj.problems

import java.io.BufferedReader

class No2606 {
    fun solve(input: BufferedReader): String {
        val computerCount = input.readLine().toInt()
        val networkCount = input.readLine().toInt()
        val graph = Array(computerCount + 1) { mutableListOf<Int>() }

        repeat(networkCount) {
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            graph[a].add(b)
            graph[b].add(a)
        }

        return (dfs(graph, 1).size - 1).toString()
    }

    private fun dfs(
        graph: Array<MutableList<Int>>,
        v: Int
    ): List<Int> {
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
        return result
    }
}
