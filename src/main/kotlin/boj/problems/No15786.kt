package boj.problems

import java.io.BufferedReader

class No15786 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        val (_, m) = input.readLine().split(" ").map { it.toInt() }
        val s = input.readLine()
        repeat(m) {
            val t = input.readLine()
            var idx = 0
            for (c in t) {
                if (idx < s.length && c == s[idx]) {
                    idx++
                    if (idx == s.length) break
                }
            }
            // idx == s.length 이면 s가 t의 부분 수열이므로 true, 아니면 false
            sb.append(idx == s.length).append('\n')
        }
        return sb.toString().trimEnd()
    }
}
