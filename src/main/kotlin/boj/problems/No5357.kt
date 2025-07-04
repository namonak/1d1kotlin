package boj.problems

import java.io.BufferedReader

class No5357 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val output = StringBuilder()

        repeat(t) {
            val s = input.readLine()
            if (s.isNullOrEmpty()) {
                // 빈 문자열 처리
                output.appendLine()
            } else {
                var prevChar = s[0]
                output.append(prevChar)
                for (i in 1 until s.length) {
                    val curr = s[i]
                    if (curr != prevChar) {
                        output.append(curr)
                        prevChar = curr
                    }
                }
                output.appendLine()
            }
        }

        // 마지막에 불필요한 개행을 제거
        return output.toString().trimEnd()
    }
}
