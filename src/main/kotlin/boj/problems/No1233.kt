package boj.problems

import java.io.BufferedReader

class No1233 {
    fun solve(input: BufferedReader): String {
        val (s1, s2, s3) = input.readLine().split(" ").map { it.toInt() }
        val sum = IntArray(s1 + s2 + s3 + 1)
        for (i in 1..s1) {
            for (j in 1..s2) {
                for (k in 1..s3) {
                    sum[i + j + k]++
                }
            }
        }
        return sum.indexOf(sum.max()).toString()
    }
}
