package boj.problems

import java.io.BufferedReader
import java.util.ArrayDeque

class No5567 {
    fun solve(input: BufferedReader): String {
        val friendCount = input.readLine().toInt()
        val relationCount = input.readLine().toInt()

        val friends = buildGraph(input, friendCount, relationCount)
        val invitees = countInvitees(friends)

        return invitees.toString()
    }

    private fun buildGraph(
        input: BufferedReader,
        friendCount: Int,
        relationCount: Int
    ): Array<MutableList<Int>> {
        val graph = Array(friendCount + 1) { mutableListOf<Int>() }

        repeat(relationCount) {
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            graph[a].add(b)
            graph[b].add(a)
        }

        return graph
    }

    private fun countInvitees(graph: Array<MutableList<Int>>): Int {
        val visited = BooleanArray(graph.size)
        val queue = ArrayDeque<Node>()

        visited[START_NODE] = true
        queue.add(Node(START_NODE, 0))

        var invited = 0

        while (queue.isNotEmpty()) {
            val (id, depth) = queue.removeFirst()

            if (depth == MAX_DEPTH) continue

            for (next in graph[id]) {
                if (visited[next]) continue
                visited[next] = true
                queue.add(Node(next, depth + 1))
                invited++
            }
        }

        return invited
    }

    private data class Node(val id: Int, val depth: Int)

    companion object {
        private const val START_NODE = 1
        private const val MAX_DEPTH = 2
    }
}
