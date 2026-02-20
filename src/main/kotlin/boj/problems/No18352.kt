package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No18352 {
    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine())
        val cityCount = st.nextToken().toInt()
        val roadCount = st.nextToken().toInt()
        val targetDistance = st.nextToken().toInt()
        val startCity = st.nextToken().toInt()

        val graph = Array(cityCount + 1) { mutableListOf<Int>() }
        repeat(roadCount) {
            val line = StringTokenizer(input.readLine())
            val start = line.nextToken().toInt()
            val end = line.nextToken().toInt()
            graph[start].add(end)
        }

        val result = findCitiesWithExactDistance(cityCount, graph, targetDistance, startCity)

        return if (result.isEmpty()) {
            "-1"
        } else {
            result.joinToString("\n")
        }
    }

    private fun findCitiesWithExactDistance(
        cityCount: Int,
        graph: Array<MutableList<Int>>,
        targetDistance: Int,
        startCity: Int
    ): List<Int> {
        val distances = IntArray(cityCount + 1) { -1 }
        val queue = ArrayDeque<Int>()

        distances[startCity] = 0
        queue.add(startCity)

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            if (distances[current] >= targetDistance) continue

            for (nextCity in graph[current]) {
                if (distances[nextCity] == -1) {
                    distances[nextCity] = distances[current] + 1
                    queue.add(nextCity)
                }
            }
        }

        return distances.indices.filter { distances[it] == targetDistance }
    }
}
