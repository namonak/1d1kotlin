package boj.problems

import java.io.BufferedReader

class No2003 {
    fun solve(input: BufferedReader): String {
        val (_, m) = input.readLine().split(" ").map { it.toInt() }
        val numbers = input.readLine().split(" ").map { it.toInt() }

        var answer = 0
        for (i in numbers.indices) {
            var sum = 0
            for (j in i until numbers.size) {
                sum += numbers[j]
                if (sum == m) {
                    answer++
                    break
                }
            }
        }

        return answer.toString()
    }
}
