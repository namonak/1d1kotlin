package boj.problems

import java.io.BufferedReader

class No10886 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var cute = 0
        repeat(n) {
            cute += input.readLine().toInt()
        }
        return if (cute > n / 2) "Junhee is cute!" else "Junhee is not cute!"
    }
}
