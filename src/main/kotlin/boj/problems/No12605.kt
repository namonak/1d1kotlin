package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No12605.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No12605 {
    fun solve(bufferedReader: BufferedReader): String {
        val caseCount = bufferedReader.readLine().toInt()
        val stringBuilder = StringBuilder()

        for (i in 1..caseCount) {
            val words = bufferedReader.readLine().split(" ")
            stringBuilder.append("Case #$i: ")
            for (j in words.size - 1 downTo 0) {
                stringBuilder.append("${words[j]} ")
            }
            stringBuilder.delete(stringBuilder.length - 1, stringBuilder.length)
            stringBuilder.append("\n")
        }

        return stringBuilder.toString().trimEnd()
    }
}
