package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2446.solve(input))

    input.close()
    output.close()
}

object No2446 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()

        // 상단 부분 출력
        for (i in n downTo 1) {
            for (j in 1..n - i) {
                sb.append(" ")
            }
            for (j in 1..2 * i - 1) {
                sb.append("*")
            }
            sb.append("\n")
        }

        // 하단 부분 출력
        for (i in 2..n) {
            for (j in 1..n - i) {
                sb.append(" ")
            }
            for (j in 1..2 * i - 1) {
                sb.append("*")
            }
            sb.append("\n")
        }

        return sb.toString().trimEnd()
    }
}
