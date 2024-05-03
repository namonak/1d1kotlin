package boj.problems

import java.io.BufferedReader

class No1032 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val files = Array(n) { input.readLine() }
        val sb = StringBuilder()
        for (i in files[0].indices) {
            val c = files[0][i]
            var isSame = true
            for (j in 1 until n) {
                if (files[j][i] != c) {
                    isSame = false
                    break
                }
            }
            sb.append(if (isSame) c else "?")
        }
        return sb.toString()
    }
}
