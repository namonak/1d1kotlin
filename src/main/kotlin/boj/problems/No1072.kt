package boj.problems

import java.io.BufferedReader

class No1072 {
    fun solve(input: BufferedReader): String {
        val (x, y) = input.readLine().split(" ").map { it.toLong() }
        val z = y * 100 / x
        if (z >= 99) return "-1"

        var left = 0L
        var right = 1000000000L
        var answer = 0L
        while (left <= right) {
            val mid = (left + right) / 2
            val newZ = (y + mid) * 100 / (x + mid)
            if (newZ > z) {
                answer = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return answer.toString()
    }
}
