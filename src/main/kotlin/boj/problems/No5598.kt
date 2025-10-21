package boj.problems

import java.io.BufferedReader

private const val SHIFT = 3
private const val ALPHABET = 26
private const val BASE = 'A'.code

class No5598 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        return buildString(s.length) {
            for (c in s) {
                // 역변환: 오른쪽으로 3 밀려있던 것을 왼쪽으로 SHIFT 복원
                val decoded = ((c.code - BASE - SHIFT + ALPHABET) % ALPHABET) + BASE
                append(decoded.toChar())
            }
        }
    }
}
