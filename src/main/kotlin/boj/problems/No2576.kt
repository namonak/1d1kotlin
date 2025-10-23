package boj.problems

import java.io.BufferedReader

class No2576 {
    fun solve(input: BufferedReader): String {
        var sum = 0
        var min = Int.MAX_VALUE

        for (i in 0 until 7) {
            val n = input.readLine().toInt()
            if (n % 2 == 1) {
                sum += n
                min = minOf(min, n)
            }
        }

        return if (sum == 0) "-1" else "$sum\n$min"
    }
}
