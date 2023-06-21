package boj.problems.step27

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1300.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No1300 {
    fun solve(input: BufferedReader): Int {
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

        return result
    }
}
