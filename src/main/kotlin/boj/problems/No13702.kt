package boj.problems

import java.io.BufferedReader

class No13702 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toLong() }
        val pots = LongArray(n.toInt()) { input.readLine().toLong() }

        var left = 1L
        var right = pots.maxOrNull() ?: 0L
        var answer = 0L

        while (left <= right) {
            val mid = (left + right) / 2
            var count = 0L

            for (pot in pots) {
                count += pot / mid
            }

            if (count >= k) {
                answer = mid
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return answer.toString()
    }
}
