package boj.problems

import java.io.BufferedReader

class No1389 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val graph = Array(n) { IntArray(n) { Int.MAX_VALUE } }

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (i == j) {
                    graph[i][j] = 0
                }
            }
        }

        repeat(m) {
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            graph[a - 1][b - 1] = 1
            graph[b - 1][a - 1] = 1
        }

        val dist = floydWarshall(graph)
        val kevinBacon = dist.map { it.sum() }

        return (kevinBacon.indexOf(kevinBacon.minOrNull()) + 1).toString()
    }

    private fun floydWarshall(graph: Array<IntArray>): Array<IntArray> {
        val dist = Array(graph.size) { graph[it].clone() }

        val n = graph.size
        for (k in 0 until n) { // 경유점
            for (i in 0 until n) { // 출발점
                for (j in 0 until n) { // 도착점
                    if (dist[i][k] != Int.MAX_VALUE && dist[k][j] != Int.MAX_VALUE) {
                        dist[i][j] = minOf(dist[i][j], dist[i][k] + dist[k][j])
                    }
                }
            }
        }
        return dist
    }
}
