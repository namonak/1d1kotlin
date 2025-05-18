package boj.problems

import java.io.BufferedReader

class No13900 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toLong() }

        var totalSum = numbers.sum()
        var result = 0L

        for (num in numbers) {
            totalSum -= num
            result += num * totalSum
        }

        return result.toString()
    }
}
