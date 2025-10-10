package boj.problems

import java.io.BufferedReader
import java.util.PriorityQueue

class No1504 {
    data class Vertex(val index: Int, val weight: Int) : Comparable<Vertex> {
        override fun compareTo(other: Vertex) = weight - other.weight
    }

    private var numVertices = 0
    private var numEdges = 0
    private var v1 = 0
    private var v2 = 0

    fun solve(input: BufferedReader): String {
        val (vertices, edges) = input.readLine().split(" ").map { it.toInt() }
        numVertices = vertices
        numEdges = edges
        val graph = Array(numVertices + 1) { mutableListOf<Vertex>() }

        repeat(numEdges) {
            val (from, to, weight) = input.readLine().split(" ").map { it.toInt() }
            graph[from].add(Vertex(to, weight))
            graph[to].add(Vertex(from, weight))
        }

        val (vertex1, vertex2) = input.readLine().split(" ").map { it.toInt() }
        v1 = vertex1
        v2 = vertex2

        val distanceFromStart = dijkstra(graph, 1)
        val distanceFromV1 = dijkstra(graph, v1)
        val distanceFromV2 = dijkstra(graph, v2)

        val route1 = if (
            distanceFromStart[v1] == Int.MAX_VALUE ||
            distanceFromV1[v2] == Int.MAX_VALUE ||
            distanceFromV2[numVertices] == Int.MAX_VALUE
        ) {
            Int.MAX_VALUE
        } else {
            distanceFromStart[v1] + distanceFromV1[v2] + distanceFromV2[numVertices]
        }
        val route2 = if (
            distanceFromStart[v2] == Int.MAX_VALUE ||
            distanceFromV2[v1] == Int.MAX_VALUE ||
            distanceFromV1[numVertices] == Int.MAX_VALUE
        ) {
            Int.MAX_VALUE
        } else {
            distanceFromStart[v2] + distanceFromV2[v1] + distanceFromV1[numVertices]
        }

        val shortestPath = if (route1 == Int.MAX_VALUE && route2 == Int.MAX_VALUE) -1 else minOf(route1, route2)

        return shortestPath.toString()
    }

    private fun dijkstra(
        graph: Array<MutableList<Vertex>>,
        start: Int
    ): IntArray {
        val distances = IntArray(graph.size) { Int.MAX_VALUE }
        val priorityQueue = PriorityQueue<Vertex>()

        distances[start] = 0
        priorityQueue.add(Vertex(start, 0))

        while (priorityQueue.isNotEmpty()) {
            val (current, currentWeight) = priorityQueue.poll()

            if (currentWeight > distances[current]) continue

            for ((next, weight) in graph[current]) {
                val newDistance = currentWeight + weight
                if (newDistance < distances[next]) {
                    distances[next] = newDistance
                    priorityQueue.add(Vertex(next, newDistance))
                }
            }
        }

        return distances
    }
}
