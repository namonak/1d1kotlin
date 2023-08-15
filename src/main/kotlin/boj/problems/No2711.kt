package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2711.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No2711 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        val number = input.readLine().toInt()
        for (i in 0 until number) {
            val (index, word) = input.readLine().split(" ")
            result.append(word.removeRange(index.toInt() - 1, index.toInt())).append("\n")
        }

        return result.toString().trim()
    }
}
