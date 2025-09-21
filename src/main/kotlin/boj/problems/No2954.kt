package boj.problems

import java.io.BufferedReader

class No2954 {
    fun solve(input: BufferedReader): String {
        val encoded = input.readLine() ?: return ""
        val vowels = setOf('a', 'e', 'i', 'o', 'u')

        val decoded = StringBuilder(encoded.length)
        var i = 0
        while (i < encoded.length) {
            val ch = encoded[i]
            decoded.append(ch)

            // 규칙: 모음 뒤에는 'p'와 같은 모음이 추가됨 → 총 3글자 패턴
            // ex) a -> "apa", e -> "epe" ...
            i += if (ch in vowels) 3 else 1
        }
        return decoded.toString().trimEnd()
    }
}
