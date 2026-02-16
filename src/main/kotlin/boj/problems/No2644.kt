package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No2644 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var st = StringTokenizer(input.readLine())
        val startNode = st.nextToken().toInt()
        val targetNode = st.nextToken().toInt()
        val m = input.readLine().toInt()

        val graph = Array(n + 1) { ArrayList<Int>() }

        repeat(m) {
            st = StringTokenizer(input.readLine())
            val parent = st.nextToken().toInt()
            val child = st.nextToken().toInt()

            graph[parent].add(child)
            graph[child].add(parent)
        }

        return bfs(n, startNode, targetNode, graph).toString()
    }

    private fun bfs(
        n: Int,
        start: Int,
        target: Int,
        graph: Array<ArrayList<Int>>
    ): Int {
        val distance = IntArray(n + 1) { -1 }
        val queue = ArrayDeque<Int>()

        distance[start] = 0
        queue.add(start)

        while (!queue.isEmpty()) {
            val current = queue.removeFirst()

            if (current == target) {
                return distance[current]
            }

            for (next in graph[current]) {
                if (distance[next] == -1) {
                    distance[next] = distance[current] + 1
                    queue.add(next)
                }
            }
        }

        return -1
    }
}
