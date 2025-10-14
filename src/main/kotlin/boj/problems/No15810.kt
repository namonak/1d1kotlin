package boj.problems

import java.io.BufferedReader

class No15810 {
    fun solve(input: BufferedReader): String {
        val (_, m) = input.readLine().split(" ").map { it.toLong() }
        val times = input.readLine().split(" ").map { it.toLong() }

        val fastest = requireNotNull(times.minOrNull())
        var lo = 0L
        var hi = fastest * m

        while (lo < hi) {
            val mid = (lo + hi) / 2
            val produced = produceBalloons(times, mid)
            if (produced < m) {
                lo = mid + 1
            } else {
                hi = mid
            }
        }

        return lo.toString()
    }

    private fun produceBalloons(
        times: List<Long>,
        time: Long
    ): Long {
        var total = 0L
        for (t in times) {
            total += time / t
        }
        return total
    }
}
