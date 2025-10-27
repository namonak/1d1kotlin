package boj.problems

import java.io.BufferedReader
import java.math.BigInteger
import kotlin.math.sqrt

class No4134 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()

        repeat(n) {
            val inputNumber = input.readLine()
            val prime = BigInteger(inputNumber)
            val number = inputNumber.toLong()
            val sqrt = sqrt(number.toDouble()).toLong()
            var s = false
            for (i in 2..sqrt) {
                if (number % i == 0L) s = true
            }
            if (s) {
                result.append(prime.nextProbablePrime())
            } else if (number == 0L || number == 1L) {
                result.append(prime.nextProbablePrime())
            } else {
                result.append(number)
            }

            result.append("\n")
        }

        return result.toString().trimEnd()
    }
}
