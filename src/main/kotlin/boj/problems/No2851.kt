package boj.problems

import java.io.BufferedReader

class No2851 {
    fun solve(input: BufferedReader): String {
        val scores = List(10) { input.readLine().toInt() }
        var sum = 0
        for (i in 0 until 10) {
            sum += scores[i]
            if (sum >= 100) {
                return if (sum - 100 <= 100 - (sum - scores[i])) sum.toString() else (sum - scores[i]).toString()
            }
        }
        return sum.toString()
    }
}
