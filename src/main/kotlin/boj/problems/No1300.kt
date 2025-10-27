package boj.problems

import java.io.BufferedReader

class No1300 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val k = input.readLine().toInt()

        var left = 1
        var right = k
        var result = 0

        while (left <= right) {
            val mid = (left + right) / 2
            var count = 0

            for (i in 1..n) {
                count += if (mid / i > n) n else mid / i
            }

            if (count >= k) {
                result = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return result.toString()
    }
}
