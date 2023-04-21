package boj.problems.step2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter

object No9498 {
    @Throws(IOException::class)
    fun solve(input: BufferedReader): String {
        return when (input.readLine().toInt()) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }
    }
}

fun main(args: Array<String>) {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))

    output.write("${No9498.solve(input)}\n")

    input.close()
    output.flush()
    output.close()
}
