package boj.problems

import java.io.BufferedReader

class No15633 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var sumDivisors = 0
        for (i in 1..n) {
            if (n % i == 0) {
                sumDivisors += i
            }
        }

        return (sumDivisors * 5 - 24).toString()
    }
}
