package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2935.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No2935 {
    fun solve(input: BufferedReader): BigInteger {
        val a = input.readLine().toBigInteger()
        val op = input.readLine()
        val b = input.readLine().toBigInteger()

        return when (op) {
            "+" -> a + b
            "*" -> a * b
            else -> throw IllegalArgumentException()
        }
    }
}
