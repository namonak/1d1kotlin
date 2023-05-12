package boj.problems.step5

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11718.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No11718 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val str = input.readLine()
            if (str == null || str.isEmpty()) {
                break
            }
            result.append("$str\n")
        }

        return result.toString().trimEnd()
    }
}
