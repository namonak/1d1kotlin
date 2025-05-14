package boj.problems

import java.io.BufferedReader

class No23746 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val mapping = mutableMapOf<Char, String>()
        repeat(n) {
            val (pattern, key) = input.readLine().split(" ")
            mapping[key[0]] = pattern
        }
        val compressed = input.readLine()
        val (s, e) = input.readLine().split(" ").map { it.toInt() }

        val result = StringBuilder()
        var curPos = 1

        for (ch in compressed) {
            val pattern = mapping[ch] ?: ""
            val len = pattern.length
            val start = curPos
            val end = curPos + len - 1

            if (end < s) {
                // 아직 구간 이전
            } else if (start > e) {
                // 구간 이후면 종료
                break
            } else {
                // 겹치는 부분만 추출
                val from = maxOf(s, start) - start
                val to = minOf(e, end) - start
                result.append(pattern.substring(from, to + 1))
            }

            curPos += len
        }

        return result.toString()
    }
}
