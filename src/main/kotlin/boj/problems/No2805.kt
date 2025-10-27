package boj.problems

import java.io.BufferedReader

class No2805 {
    fun solve(input: BufferedReader): String {
        val (_, needLength) = input.readLine().split(" ").map { it.toLong() }
        val trees = input.readLine().split(" ").map { it.toLong() }
        val max = trees.maxOrNull()!!

        var start = 0L
        var end = max
        var result = 0L

        while (start <= end) {
            val mid = (start + end) / 2
            var sum = 0L

            for (tree in trees) {
                if (tree > mid) {
                    sum += tree - mid
                }
            }

            if (sum >= needLength) {
                start = mid + 1
                result = mid
            } else {
                end = mid - 1
            }
        }

        return result.toString()
    }
}
