package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.max

class No11052 {
    private lateinit var prices: IntArray
    private lateinit var memo: IntArray

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val st = StringTokenizer(input.readLine())

        prices = IntArray(n + 1)
        for (i in 1..n) {
            prices[i] = st.nextToken().toInt()
        }

        // 메모이제이션 배열 초기화 (-1은 아직 계산되지 않음을 의미)
        memo = IntArray(n + 1) { -1 }
        memo[0] = 0 // 0개 구매 비용은 0

        return dp(n).toString()
    }

    private fun dp(n: Int): Int {
        if (memo[n] != -1) return memo[n]

        var maxPrice = 0
        for (i in 1..n) {
            maxPrice = max(maxPrice, dp(n - i) + prices[i])
        }

        memo[n] = maxPrice
        return maxPrice
    }
}
