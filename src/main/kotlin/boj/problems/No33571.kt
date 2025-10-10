package boj.problems

import java.io.BufferedReader

class No33571 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()

        // 홀 개수 매핑: 명시된 문자만 카운트 (그 외는 0)
        val holes: Map<Char, Int> = mapOf(
            'A' to 1,
            'a' to 1,
            'B' to 2,
            'b' to 1,
            'D' to 1,
            'd' to 1,
            'e' to 1,
            'g' to 1,
            'O' to 1,
            'o' to 1,
            'P' to 1,
            'p' to 1,
            'Q' to 1,
            'q' to 1,
            'R' to 1,
            '@' to 1
        )

        var total = 0
        for (ch in s) total += holes.getOrDefault(ch, 0)

        return "$total"
    }
}
