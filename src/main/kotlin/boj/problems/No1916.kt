package boj.problems

import java.io.BufferedReader
import java.util.PriorityQueue

class No1916 {
    data class Vertex(val index: Int, val weight: Int)

    private var n = 0
    private var m = 0

    fun solve(input: BufferedReader): String {
        n = input.readLine().toInt()
        m = input.readLine().toInt()

        val graph = Array(n + 1) { mutableListOf<Vertex>() }

        for (i in 1..m) {
            val (from, to, weight) = input.readLine().split(" ").map { it.toInt() }
            graph[from].add(Vertex(to, weight))
        }

        val (start, end) = input.readLine().split(" ").map { it.toInt() }

        return dijkstra(graph, start)[end].toString()
    }

    private fun dijkstra(graph: Array<MutableList<Vertex>>, start: Int): IntArray {
        val dist = IntArray(n + 1) { Int.MAX_VALUE } // 최단 거리를 저장할 배열 (초기 값은 무한대)
        val pq = PriorityQueue(compareBy<Vertex> { it.weight }) // 우선순위 큐 (최단 거리를 기준으로 우선순위 설정)

        dist[start] = 0 // 시작점의 거리는 0으로 설정
        pq.add(Vertex(start, 0)) // 시작점과 그 거리를 큐에 추가

        while (pq.isNotEmpty()) {
            val (current, currentDist) = pq.poll() // 가장 거리가 짧은 정점을 꺼냄

            // 이미 처리된 정점이라면 무시
            if (currentDist > dist[current]) continue

            // 현재 정점과 연결된 모든 인접 정점을 확인
            for ((next, weight) in graph[current]) {
                val newDist = currentDist + weight // 새로운 경로로의 거리 계산
                if (newDist < dist[next]) { // 더 짧은 경로가 있으면 갱신
                    dist[next] = newDist
                    pq.add(Vertex(next, newDist)) // 갱신된 경로를 큐에 추가
                }
            }
        }

        return dist // 최단 거리 배열 반환
    }
}
