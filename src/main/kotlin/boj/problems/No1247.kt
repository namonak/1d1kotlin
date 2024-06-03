package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

class No1247 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        repeat(3) {
            val n = input.readLine().toInt()
            var sum = BigInteger.ZERO
            repeat(n) {
                sum += input.readLine().toBigInteger()
            }
            sb.appendLine(
                when {
                    sum == BigInteger.ZERO -> "0"
                    sum > BigInteger.ZERO -> "+"
                    else -> "-"
                }
            )
        }
        return sb.toString().trimEnd()
    }
}
