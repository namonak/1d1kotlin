package boj.problems

import java.io.BufferedReader
import java.util.PriorityQueue

class No1753 {
    data class Vertex(val index: Int, val weight: Int) : Comparable<Vertex> {
        override fun compareTo(other: Vertex) = weight - other.weight
    }

    fun solve(input: BufferedReader): String {
        val (vertexCount, edgeCount) = input.readLine().split(" ").map { it.toInt() }
        val startVertex = input.readLine().toInt()
        val graph = initializeGraph(input, vertexCount, edgeCount)

        val distances = dijkstra(graph, startVertex)
        return distances.drop(1)
            .joinToString("\n") { if (it == Int.MAX_VALUE) "INF" else it.toString() }
    }

    private fun initializeGraph(
        input: BufferedReader,
        vertexCount: Int,
        edgeCount: Int
    ): Array<MutableList<Vertex>> {
        val graph = Array(vertexCount + 1) { mutableListOf<Vertex>() }
        repeat(edgeCount) {
            val (from, to, weight) = input.readLine().split(" ").map { it.toInt() }
            graph[from].add(Vertex(to, weight))
        }
        return graph
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
