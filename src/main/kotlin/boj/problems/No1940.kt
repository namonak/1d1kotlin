package boj.problems

import java.io.BufferedReader

class No1940 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val m = input.readLine().toInt()
        val clothes = input.readLine().split(" ").map { it.toInt() }.toIntArray()
        var answer = 0

        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (clothes[i] + clothes[j] == m) {
                    answer++
                }
            }
        }

        return answer.toString()
    }
}
