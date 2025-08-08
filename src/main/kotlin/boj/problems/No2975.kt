package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No2975 {
    fun solve(input: BufferedReader): String {
        val out = StringBuilder()

        while (true) {
            val line = input.readLine() ?: break
            if (line.isBlank()) continue

            val st = StringTokenizer(line)
            val balance = st.nextToken().toInt()
            val op = st.nextToken()
            val amount = st.nextToken().toInt()

            // 종료 조건: 0 W 0
            if (balance == SENTINEL_BAL && op == SENTINEL_OP && amount == SENTINEL_AMT) break

            when (op) {
                "D" -> out.append(balance + amount)
                "W" -> {
                    val nextBalance = balance - amount
                    if (nextBalance < OVERDRAFT_LIMIT) {
                        out.append("Not allowed")
                    } else {
                        out.append(nextBalance)
                    }
                }
                else -> error("Unexpected operation: $op")
            }
            out.append('\n')
        }

        return out.toString().trimEnd()
    }

    companion object {
        private const val OVERDRAFT_LIMIT = -200
        private const val SENTINEL_BAL = 0
        private const val SENTINEL_OP = "W"
        private const val SENTINEL_AMT = 0
    }
}
