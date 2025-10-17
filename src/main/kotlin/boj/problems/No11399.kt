package boj.problems

import java.io.BufferedReader

class No11399 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }.sorted()

        var prev = 0
        var sum = 0

        for (i in 0 until n) {
            sum += prev + numbers[i]
            prev += numbers[i]
        }

        return sum.toString()
    }
}
