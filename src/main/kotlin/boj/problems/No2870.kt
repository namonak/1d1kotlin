package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

class No2870 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = mutableListOf<BigInteger>()
        repeat(n) {
            val line = input.readLine()
            val extractedNumbers = line.split(Regex("[^0-9]"))
                .filter { it.isNotEmpty() }
                .map { BigInteger(it) }
            numbers.addAll(extractedNumbers)
        }
        return numbers.sorted().joinToString("\n")
    }
}
