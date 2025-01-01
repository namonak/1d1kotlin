package boj.problems

import java.io.BufferedReader

class No11059 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine().trim()
        val n = s.length

        val prefixSum = IntArray(n + 1)
        for (i in 0 until n) {
            prefixSum[i + 1] = prefixSum[i] + (s[i] - '0')
        }

        val maxEvenLength = if (n % 2 == 0) n else n - 1

        for (length in maxEvenLength downTo 2 step 2) {
            for (start in 0..n - length) {
                val mid = start + length / 2
                val end = start + length
                val sumFront = prefixSum[mid] - prefixSum[start]
                val sumBack = prefixSum[end] - prefixSum[mid]
                if (sumFront == sumBack) {
                    return length.toString()
                }
            }
        }

        return "0"
    }
}
