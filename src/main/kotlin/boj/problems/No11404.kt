package boj.problems

import java.io.BufferedReader

class No11404 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val m = input.readLine().toInt()
        val graph = Array(n) { IntArray(n) { Int.MAX_VALUE } }

        graph.indices.forEach { graph[it][it] = 0 }

        repeat(m) {
            val (i, j, w) = input.readLine().split(" ").map { it.toInt() }
            graph[i - 1][j - 1] = minOf(graph[i - 1][j - 1], w)
        }

        val dist = floydWarshall(graph)

        graph.indices.forEach { i ->
            graph[i].indices.forEach { j ->
                if (dist[i][j] == Int.MAX_VALUE) {
                    dist[i][j] = 0
                }
            }
        }

        return dist.joinToString("\n") { it.joinToString(" ") }
    }

    private fun floydWarshall(graph: Array<IntArray>): Array<IntArray> {
        val dist = Array(graph.size) { graph[it].clone() }

        val n = graph.size
        for (k in 0 until n) {
            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (dist[i][k] != Int.MAX_VALUE && dist[k][j] != Int.MAX_VALUE) {
                        dist[i][j] = minOf(dist[i][j], dist[i][k] + dist[k][j])
                    }
                }
            }
        }
        return dist
    }
}
