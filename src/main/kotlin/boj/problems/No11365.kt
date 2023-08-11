package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11365.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No11365 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        var line = input.readLine()
        while (line != "END") {
            result.append(line.reversed())
            result.append("\n")
            line = input.readLine()
        }
        return result.toString()
    }
}
