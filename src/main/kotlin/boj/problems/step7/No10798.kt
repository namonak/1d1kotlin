package boj.problems.step7

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10798.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No10798 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuffer()
        val arr = Array(5) { CharArray(15) }

        for (i in arr.indices) {
            val word: String = input.readLine()
            for (j in word.indices) {
                arr[i][j] = word[j]
            }
        }

        for (i in 0..14) {
            for (j in 0..4) {
                if (arr[j][i] != '\u0000') {
                    sb.append(arr[j][i])
                }
            }
        }

        return sb.toString()
    }
}
