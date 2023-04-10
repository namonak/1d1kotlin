package boj.problems.step7

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter

object No2292 {
    @Throws(IOException::class)
    fun solve(number: Int): Int {
        var count = 1
        var range = 2
        if (number == 1) {
            return 1
        }
        while (range <= number) {
            range += count * 6
            count++
        }
        return count
    }
}

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))

    output.write("${No2292.solve(input.readLine().toInt())}\n")

    input.close()
    output.flush()
    output.close()
}
