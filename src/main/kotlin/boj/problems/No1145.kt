package boj.problems

import java.io.BufferedReader

class No1145 {
    fun solve(input: BufferedReader): String {
        val numbers = input.readLine().split(" ").map { it.toInt() }
        var result = 1
        while (true) {
            if (numbers.count { result % it == 0 } >= 3) {
                return result.toString()
            }
            result++
        }
    }
}
