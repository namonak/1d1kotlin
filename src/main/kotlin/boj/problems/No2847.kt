package boj.problems

import java.io.BufferedReader

class No2847 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val scores = IntArray(n) { input.readLine().toInt() }
        var reductions = 0

        for (i in n - 2 downTo 0) {
            if (scores[i] >= scores[i + 1]) {
                reductions += scores[i] - (scores[i + 1] - 1)
                scores[i] = scores[i + 1] - 1
            }
        }
        return reductions.toString()
    }
}
