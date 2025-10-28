package boj.problems

import java.io.BufferedReader

class No12851 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val (time, count) = shortestTimeAndWays(n, k)

        return "$time\n$count"
    }

    private fun shortestTimeAndWays(
        n: Int,
        k: Int
    ): Pair<Int, Int> {
        if (n >= k) return Pair(n - k, 1)

        val dist = IntArray(LIMIT + 1) { -1 }
        val ways = IntArray(LIMIT + 1)
        val queue = ArrayDeque<Int>()

        dist[n] = 0
        ways[n] = 1
        queue.add(n)

        while (queue.isNotEmpty()) {
            val x = queue.removeFirst()
            val nextTime = dist[x] + 1
            val nexts = intArrayOf(x - 1, x + 1, x * 2)
            for (next in nexts) {
                if (next !in 0..LIMIT) continue

                if (dist[next] == -1) {
                    dist[next] = nextTime
                    ways[next] = ways[x]
                    queue.add(next)
                } else if (dist[next] == nextTime) {
                    ways[next] += ways[x]
                }
            }
        }

        return Pair(dist[k], ways[k])
    }

    private companion object {
        const val LIMIT = 100_000
    }
}
