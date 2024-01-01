package boj.problems

import java.io.BufferedReader

object No2506 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val scores = input.readLine().split(" ").map { it.toInt() }
        var sum = 0
        var count = 0
        scores.forEach {
            if (it == 1) {
                count++
                sum += count
            } else {
                count = 0
            }
        }
        return sum.toString()
    }
}
