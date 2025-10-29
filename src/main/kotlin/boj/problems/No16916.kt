package boj.problems

import java.io.BufferedReader

class No16916 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val p = input.readLine()

        return if (kmpSearch(s, p)) "1" else "0"
    }

    private fun kmpSearch(
        text: String,
        pattern: String
    ): Boolean {
        val pi = computePI(pattern)
        var j = 0 // 패턴 문자열을 탐색하는 인덱스

        for (i in text.indices) {
            while (j > 0 && text[i] != pattern[j]) {
                j = pi[j - 1] // 일치하지 않으면 이전의 매칭 위치로 이동
            }

            if (text[i] == pattern[j]) {
                if (j == pattern.length - 1) {
                    return true // 패턴이 전체 일치하면 성공
                } else {
                    j++
                }
            }
        }
        return false
    }

    private fun computePI(pattern: String): IntArray {
        val pi = IntArray(pattern.length)
        var j = 0

        for (i in 1 until pattern.length) {
            while (j > 0 && pattern[i] != pattern[j]) {
                j = pi[j - 1] // 일치하지 않으면 이전의 매칭 위치로 이동
            }

            if (pattern[i] == pattern[j]) {
                pi[i] = j + 1
                j++
            }
        }

        return pi
    }
}
