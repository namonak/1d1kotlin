package boj.problems.step15

import java.io.BufferedReader
import java.math.BigInteger
import kotlin.math.sqrt

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No4134.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No4134 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()

        repeat(n) {
            val input: String = input.readLine()
            val prime = BigInteger(input)
            val number = input.toLong()
            val sqrt = sqrt(number.toDouble()).toLong()
            var s = false
            for (i in 2..sqrt) {
                if (number % i == 0L) s = true
            }
            if (s) sb.append(prime.nextProbablePrime()) else if (number == 0L || number == 1L) {
                sb.append(prime.nextProbablePrime())
            } else sb.append(number)

            sb.append("\n")
        }

        return sb.toString()
    }
}
