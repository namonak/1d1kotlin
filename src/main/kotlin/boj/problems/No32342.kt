package boj.problems

import java.io.BufferedReader

class No32342 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        val q = input.readLine().toInt()
        repeat(q) {
            val s = input.readLine()
            var count = 0
            for (i in 0 until s.length - 2) {
                if (s[i] == 'W' && s[i + 1] == 'O' && s[i + 2] == 'W') {
                    count++
                }
            }
            sb.appendLine(count.toString())
        }
        return sb.toString().trimEnd()
    }
}
