package boj.problems

import java.io.BufferedReader

class No11403 {
    companion object {
        private const val UNREACHABLE = Int.MAX_VALUE
    }

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val graph = readGraph(input, n)
        val reachabilityMatrix = findAllReachablePaths(graph)

        return formatMatrix(reachabilityMatrix)
    }

    private fun readGraph(input: BufferedReader, n: Int): Array<IntArray> {
        return Array(n) {
            input.readLine().split(" ").map { if (it == "0") UNREACHABLE else it.toInt() }.toIntArray()
        }
    }

    private fun findAllReachablePaths(graph: Array<IntArray>): Array<IntArray> {
        val dist = Array(graph.size) { graph[it].clone() }

        val n = graph.size
        for (k in 0 until n) {
            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (dist[i][k] != UNREACHABLE && dist[k][j] != UNREACHABLE) {
                        dist[i][j] = minOf(dist[i][j], dist[i][k] + dist[k][j])
                    }
                }
            }
        }

        return dist.map { row ->
            row.map { if (it == UNREACHABLE) 0 else 1 }.toIntArray()
        }.toTypedArray()
    }

    private fun formatMatrix(matrix: Array<IntArray>): String {
        return matrix.joinToString("\n") { it.joinToString(" ") }
    }
}
