package boj.problems

import java.io.BufferedReader

object No3059 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(t) {
            val s = input.readLine()
            val arr = IntArray(26)
            s.forEach { arr[it - 'A']++ }
            var sum = 0
            for (i in arr.indices) {
                if (arr[i] == 0) {
                    sum += i + 'A'.code
                }
            }
            sb.appendLine(sum)
        }
        return sb.toString().trimEnd()
    }
}
