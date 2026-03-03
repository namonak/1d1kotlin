package boj.problems

import java.io.BufferedReader

class No1967 {
    data class Edge(val to: Int, val weight: Int)

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        if (n == 1) return "0"

        // 1-based index를 위한 N + 1 크기 할당
        val graph = Array(n + 1) { ArrayList<Edge>() }

        repeat(n - 1) {
            val (u, v, w) = input.readLine().split(" ").map { it.toInt() }

            graph[u].add(Edge(v, w))
            graph[v].add(Edge(u, w))
        }

        // 임의의 노드(1번)에서 가장 먼 노드 탐색
        val (farthestNodeFromStart, _) = findFarthestNode(1, n, graph)

        // 찾아낸 노드에서 가장 먼 노드 탐색 (이때의 거리가 트리의 지름)
        val (_, treeDiameter) = findFarthestNode(farthestNodeFromStart, n, graph)

        return treeDiameter.toString()
    }

    private fun findFarthestNode(
        start: Int,
        n: Int,
        graph: Array<ArrayList<Edge>>
    ): Pair<Int, Int> {
        val distances = IntArray(n + 1) { -1 }
        val queue = ArrayDeque<Int>()

        queue.addLast(start)
        distances[start] = 0

        var maxDistance = 0
        var farthestNode = start

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            val currentDistance = distances[current]

            for (edge in graph[current]) {
                if (distances[edge.to] == -1) {
                    val nextDistance = currentDistance + edge.weight
                    distances[edge.to] = nextDistance
                    queue.addLast(edge.to)

                    // 최장 거리 갱신
                    if (nextDistance > maxDistance) {
                        maxDistance = nextDistance
                        farthestNode = edge.to
                    }
                }
            }
        }

        return Pair(farthestNode, maxDistance)
    }
}
