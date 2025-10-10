package boj.problems

import java.io.BufferedReader

const val MAX = 21

class No9184 {
    // 문제의 조건에 따라, a, b, c의 값이 각각 0 이하이거나 20 초과인 경우는 결과가 정해져 있기 때문에 MAX(21)로만 설정
    val dp = Array(MAX) { Array(MAX) { IntArray(MAX) } }

    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
            if (a == -1 && b == -1 && c == -1) break

            result.append("w($a, $b, $c) = ${w(a, b, c)}\n")
        }

        return result.toString().trimEnd()
    }

    private fun w(
        a: Int,
        b: Int,
        c: Int
    ): Int {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1
        }
        if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20)
        }

        if (dp[a][b][c] != 0) {
            return dp[a][b][c]
        }

        if (a < b && b < c) {
            dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c)
            return dp[a][b][c]
        }

        dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1)
        return dp[a][b][c]
    }
}
