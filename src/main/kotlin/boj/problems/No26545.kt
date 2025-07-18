package boj.problems

import java.io.BufferedReader

class No26545 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = Array(n) {
            input.readLine().toInt()
        }
        return numbers.sum().toString()
    }
}
