package boj.problems

import java.io.BufferedReader

class No3449 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(t) {
            val a = input.readLine()
            val b = input.readLine()
            var count = 0
            for (i in a.indices) {
                if (a[i] != b[i]) count++
            }
            sb.append("Hamming distance is $count.\n")
        }
        return sb.toString().trim()
    }
}
