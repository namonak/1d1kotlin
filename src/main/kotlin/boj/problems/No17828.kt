package boj.problems

import java.io.BufferedReader

class No17828 {
    fun solve(input: BufferedReader): String {
        val (n, x) = input.readLine().split(" ").map { it.toInt() }
        if (n * 26 < x || n > x) return "!"
        val result = CharArray(n) { 'A' }
        var remain = x - n
        for (i in n - 1 downTo 0) {
            val add = minOf(remain, 25)
            result[i] = 'A' + add
            remain -= add
        }
        return result.joinToString("")
    }
}
