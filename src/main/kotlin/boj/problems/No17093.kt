package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No17093 {
    private data class Point(val x: Int, val y: Int)

    /**
     * Total Circle (BOJ 17093)
     *
     * 정답 = max_{i in Q, j in P} ( (Q_i.x - P_j.x)^2 + (Q_i.y - P_j.y)^2 )
     * - 제곱근 없이 "거리의 제곱"으로 비교/출력 (정확하고 빠름)
     * - 오버플로 방지를 위해 곱셈 전 Long으로 변환
     * - 시간복잡도 O(N*M), N,M <= 1000 이므로 충분
     */
    fun solve(input: BufferedReader): String {
        val (n, m) = input.nextInts()
        val pList = List(n) { input.readPoint() }
        val qList = List(m) { input.readPoint() }

        var maxDistance = Long.MIN_VALUE
        for (q in qList) {
            for (p in pList) {
                val dx = (q.x - p.x).toLong()
                val dy = (q.y - p.y).toLong()
                val distanceSquared = dx * dx + dy * dy
                maxDistance = maxOf(maxDistance, distanceSquared)
            }
        }
        return maxDistance.toString()
    }

    private fun BufferedReader.nextInts(): Pair<Int, Int> {
        val st = StringTokenizer(readLine())
        return Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }

    private fun BufferedReader.readPoint(): Point {
        val st = StringTokenizer(readLine())
        return Point(st.nextToken().toInt(), st.nextToken().toInt())
    }
}
