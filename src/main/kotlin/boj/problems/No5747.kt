package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No5747 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val n = input.readLine().trim().toInt()
            if (n == 0) break

            val maryCards = readInts(input)
            val johnCards = readInts(input)

            val maryEven = maryCards.count { it % 2 == 0 }
            val maryOdd = n - maryEven

            val johnEven = johnCards.count { it % 2 == 0 }
            val johnOdd = n - johnEven

            val guaranteedWins =
                maxOf(0, maryEven - johnOdd) +
                    maxOf(0, maryOdd - johnEven)

            result.appendLine(guaranteedWins)
        }

        return result.toString().trimEnd()
    }

    private fun readInts(input: BufferedReader): List<Int> {
        val st = StringTokenizer(input.readLine())
        return List(st.countTokens()) { st.nextToken().toInt() }
    }
}
