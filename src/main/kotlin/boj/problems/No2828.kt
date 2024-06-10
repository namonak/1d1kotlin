package boj.problems

import java.io.BufferedReader

class No2828 {
    fun solve(input: BufferedReader): String {
        val (_, m) = input.readLine().split(" ").map { it.toInt() }
        val j = input.readLine().toInt()
        var left = 1
        var right = m
        var result = 0
        repeat(j) {
            val apple = input.readLine().toInt()
            if (apple < left) {
                result += left - apple
                left = apple
                right = left + m - 1
            } else if (apple > right) {
                result += apple - right
                right = apple
                left = right - m + 1
            }
        }
        return result.toString()
    }
}
