package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No26530 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        val n = input.readLine()?.toIntOrNull() ?: 0

        repeat(n) {
            val x = input.readLine()?.trim()?.toIntOrNull() ?: 0
            var totalProfit = 0.0

            repeat(x) {
                val st = StringTokenizer(input.readLine())
                if (st.hasMoreTokens()) {
                    // 품목 이름은 합산에 필요하지 않으므로 건너뜁니다.
                    st.nextToken()
                    val quantity = st.nextToken().toDouble()
                    val unitPrice = st.nextToken().toDouble()

                    totalProfit += quantity * unitPrice
                }
            }

            result.append("$%.2f".format(totalProfit)).append("\n")
        }

        return result.toString().trimEnd()
    }
}
