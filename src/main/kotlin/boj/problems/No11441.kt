package boj.problems

import java.io.BufferedReader

class No11441 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val arr = input.readLine().split(" ").map { it.toInt() }
        val sum = IntArray(n + 1)
        for (i in 1..n) {
            sum[i] = sum[i - 1] + arr[i - 1]
        }
        val m = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(m) {
            val (start, end) = input.readLine().split(" ").map { it.toInt() }
            sb.append(sum[end] - sum[start - 1]).append("\n")
        }
        return sb.toString().trimEnd()
    }
}
