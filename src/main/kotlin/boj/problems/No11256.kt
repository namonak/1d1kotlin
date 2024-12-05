package boj.problems

import java.io.BufferedReader

class No11256 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()
        repeat(t) {
            val (j, n) = input.readLine().split(" ").map { it.toInt() }
            val boxes = List(n) { input.readLine().split(" ").map { it.toInt() } }
            val candies = boxes.map { it[0] * it[1] }.sortedDescending()
            var count = 0
            var sum = 0
            for (candy in candies) {
                sum += candy
                count++
                if (sum >= j) break
            }
            result.appendLine(count)
        }
        return result.toString().trim()
    }
}
