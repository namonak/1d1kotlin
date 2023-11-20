package boj.problems

import java.io.BufferedReader

object No2343 {
    fun solve(input: BufferedReader): String {
        val (_, m) = input.readLine().split(" ").map { it.toInt() }
        val lessons = input.readLine().split(" ").map { it.toInt() }

        var left = lessons.maxOrNull()!!
        var right = lessons.sum()

        while (left <= right) {
            val mid = (left + right) / 2
            var sum = 0
            var count = 1

            lessons.forEach {
                if (sum + it > mid) {
                    sum = 0
                    count++
                }
                sum += it
            }

            if (count <= m) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return left.toString()
    }
}
