package boj.problems.step2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter

object No2753 {
    @Throws(IOException::class)
    fun solve(input: BufferedReader): Int {
        val year = input.readLine().toInt()
        return if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            1
        } else 0
    }
}

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))

    output.write("${No2753.solve(input)}\n")

    input.close()
    output.flush()
    output.close()
}
