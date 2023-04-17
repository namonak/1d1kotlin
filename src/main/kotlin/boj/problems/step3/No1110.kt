package boj.problems.step3

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.OutputStreamWriter

object No1110 {
    @JvmStatic
    @Throws(IOException::class)
    fun main(args: Array<String>) {
        val input = BufferedReader(java.io.InputStreamReader(System.`in`))
        val output = BufferedWriter(OutputStreamWriter(System.out))

        output.write(solve(input.readLine().toInt()).toString())

        input.close()
        output.flush()
        output.close()
    }

    @Throws(IOException::class)
    fun solve(number: Int): Int {
        var result = 0
        var newNumber = number
        do {
            val leftNumber = newNumber / 10
            val rightNumber = newNumber % 10
            newNumber = rightNumber * 10 + (leftNumber + rightNumber) % 10
            result++
        } while (number != newNumber)
        return result
    }
}
