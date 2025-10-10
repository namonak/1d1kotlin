package boj.problems

import java.io.BufferedReader

private const val PATTERN_LENGTH = 7

class No17838 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val out = StringBuilder()

        repeat(t) {
            val s = input.readLine().trim()
            out.append(if (isYoonpyoCommand(s)) 1 else 0).append('\n')
        }

        return out.toString().trimEnd()
    }

    /**
     * 윤표가 좋아하는 커맨드인지 검사한다.
     * 조건:
     * 1) 길이 7
     * 2) 사용 문자가 정확히 2종류
     * 3) 패턴 A A B B A B B (A!=B)
     */
    private fun isYoonpyoCommand(s: String): Boolean {
        if (s.length != PATTERN_LENGTH) return false

        // 정확히 2종류의 문자만 사용
        val distinctChars = s.toSet()
        if (distinctChars.size != 2) return false

        val a = s[0]
        val b = s[2]

        // A와 B는 달라야 함
        if (a == b) return false

        // AABBABB 패턴 체크: A=A at 0,1,4 / B=B at 2,3,5,6
        return (s[1] == a && s[4] == a) &&
            (s[3] == b && s[5] == b && s[6] == b)
    }
}
