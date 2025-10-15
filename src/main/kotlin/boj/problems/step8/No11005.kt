package boj.problems.step8

import java.io.BufferedReader

class No11005 {
    fun solve(input: BufferedReader): String {
        val (number, radix) = input.readLine().split(" ").map { it.toInt() }
        val result = StringBuilder()

        var quotient = number
        while (quotient > 0) {
            val remainder = quotient % radix
            quotient /= radix

            result.append(
                if (remainder < 10) {
                    remainder
                } else {
                    'A' + remainder - 10
                }
            )
        }

        return result.reversed().toString()
    }
}
