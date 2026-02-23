package boj.problems

import java.io.BufferedReader

class No1786 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine()
        val p = input.readLine()

        return kmpSearch(t, p)
    }

    private fun makeTable(pattern: String): IntArray {
        val m = pattern.length
        val table = IntArray(m)
        var j = 0

        for (i in 1 until m) {
            while (j > 0 && pattern[i] != pattern[j]) {
                j = table[j - 1]
            }

            if (pattern[i] == pattern[j]) {
                table[i] = ++j
            }
        }

        return table
    }

    private fun kmpSearch(
        text: String,
        pattern: String
    ): String {
        val pi = makeTable(pattern)
        val sb = StringBuilder()
        var count = 0
        var j = 0

        for (i in text.indices) {
            while (j > 0 && text[i] != pattern[j]) {
                j = pi[j - 1]
            }

            if (text[i] == pattern[j]) {
                if (j == pattern.length - 1) {
                    count++
                    // 결과를 곧바로 StringBuilder에 공백과 함께 추가
                    sb.append(i - pattern.length + 2).append(" ")
                    j = pi[j]
                } else {
                    j++
                }
            }
        }

        // 요구사항에 맞춰 최종 출력 문자열을 포맷팅합니다.
        // 첫 줄에 개수, 둘째 줄에 인덱스 목록
        return "$count\n${sb.toString().trimEnd()}"
    }
}
