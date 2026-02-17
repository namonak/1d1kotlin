package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

private const val MAX_INPUT_NUMBER = 31

class No16395 {
    // 0으로 초기화 (방문하지 않음). -1 대신 0을 써도 됨 (결과값이 자연수이므로)
    private val memo = Array(MAX_INPUT_NUMBER) { IntArray(MAX_INPUT_NUMBER) }

    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine())
        val n = st.nextToken().toInt()
        val k = st.nextToken().toInt()

        // 문제에서 1-based index를 사용하므로 n, k 그대로 전달
        return dp(n, k).toString()
    }

    private fun dp(
        n: Int,
        k: Int
    ): Int {
        // 기저 조건 간소화: 양 끝 값은 1
        if (k == 1 || k == n) {
            return 1
        }

        // 메모이제이션 확인 (0이 아니면 이미 계산된 것)
        if (memo[n][k] != 0) {
            return memo[n][k]
        }

        // 점화식: 바로 위 행의 인접한 두 수의 합
        memo[n][k] = dp(n - 1, k - 1) + dp(n - 1, k)

        return memo[n][k]
    }
}
