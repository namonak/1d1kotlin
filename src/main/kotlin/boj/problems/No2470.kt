package boj.problems

import java.io.BufferedReader

class No2470 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val liquids = input.readLine().split(" ").map { it.toInt() }.sorted()

        var left = 0
        var right = n - 1
        var minAbsSum = Int.MAX_VALUE
        var result = Pair(0, 0)

        while (left < right) {
            val sum = liquids[left] + liquids[right]
            val absSum = kotlin.math.abs(sum)

            if (absSum < minAbsSum) {
                minAbsSum = absSum
                result = Pair(liquids[left], liquids[right])
            }

            if (sum < 0) {
                left++
            } else {
                right--
            }
        }

        return "${result.first} ${result.second}"
    }
}
