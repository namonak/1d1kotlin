package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No2012 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val ranks = IntArray(n) { input.readLine().toInt() }.sorted()
        var result = 0L

        for (i in 0 until n) {
            result += abs(ranks[i] - (i + 1))
        }

        return result.toString()
    }
}
