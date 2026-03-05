package boj.problems

import java.io.BufferedReader
import java.util.PriorityQueue
import java.util.StringTokenizer

class No11779 {
    private class Edge(val to: Int, val cost: Int) : Comparable<Edge> {
        override fun compareTo(other: Edge): Int = this.cost.compareTo(other.cost)
    }

    fun solve(input: BufferedReader): String {
        // 1. 입력 파싱
        val n = input.readLine().toInt()
        val m = input.readLine().toInt()
        val graph = Array(n + 1) { ArrayList<Edge>() }

        var st: StringTokenizer
        repeat(m) {
            st = StringTokenizer(input.readLine())
            val u = st.nextToken().toInt()
            val v = st.nextToken().toInt()
            val w = st.nextToken().toInt()
            graph[u].add(Edge(v, w))
        }

        st = StringTokenizer(input.readLine())
        val start = st.nextToken().toInt()
        val end = st.nextToken().toInt()

        // 2. 알고리즘 수행 및 데이터 초기화
        val dist = IntArray(n + 1) { Int.MAX_VALUE }
        val prev = IntArray(n + 1) { -1 }

        runDijkstra(start, end, graph, dist, prev)

        // 3. 경로 역추적
        val path = tracePath(end, prev)

        // 4. 결과 출력 포맷팅
        return formatResult(dist[end], path)
    }

    // 핵심 알고리즘 분리
    private fun runDijkstra(
        start: Int,
        end: Int,
        graph: Array<ArrayList<Edge>>,
        dist: IntArray,
        prev: IntArray
    ) {
        val pq = PriorityQueue<Edge>()
        dist[start] = 0
        pq.offer(Edge(start, 0))

        while (pq.isNotEmpty()) {
            val current = pq.poll()
            val now = current.to
            val currentCost = current.cost

            if (dist[now] < currentCost) continue
            if (now == end) break

            for (edge in graph[now]) {
                val next = edge.to
                val nextCost = currentCost + edge.cost

                if (nextCost < dist[next]) {
                    dist[next] = nextCost
                    prev[next] = now
                    pq.offer(Edge(next, nextCost))
                }
            }
        }
    }

    // 경로 역추적 로직 분리
    private fun tracePath(
        end: Int,
        prev: IntArray
    ): ArrayList<Int> {
        val path = ArrayList<Int>()
        var curr = end
        while (curr != -1) {
            path.add(curr)
            curr = prev[curr]
        }
        path.reverse()
        return path
    }

    // 출력 포맷팅 로직 분리
    private fun formatResult(
        minCost: Int,
        path: ArrayList<Int>
    ): String {
        val sb = StringBuilder()
        sb.append(minCost).append("\n")
        sb.append(path.size).append("\n")
        path.forEach { sb.append(it).append(" ") }
        return sb.toString().trimEnd()
    }
}
