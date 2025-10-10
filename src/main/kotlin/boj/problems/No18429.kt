package boj.problems

import java.io.BufferedReader

class No18429 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val exercises = input.readLine().split(" ").map { it.toInt() }
        val visited = BooleanArray(n) { false }

        fun dfs(
            day: Int,
            weight: Int
        ): Int {
            if (weight < INITIAL_WEIGHT) return 0
            if (day == n) return 1

            val nextWeight = weight - k
            var sum = 0
            for (i in 0 until n) {
                if (!visited[i]) {
                    visited[i] = true
                    sum += dfs(day + 1, nextWeight + exercises[i])
                    visited[i] = false
                }
            }
            return sum
        }

        val result = dfs(0, INITIAL_WEIGHT)
        return result.toString()
    }

    companion object {
        private const val INITIAL_WEIGHT = 500
    }
}
