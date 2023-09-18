package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1259.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No1259 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val line = input.readLine()
            if (line == "0") break

            result.append("${if (isPalindrome(line)) "yes" else "no"}\n")
        }

        return result.toString().trimEnd()
    }

    private fun isPalindrome(line: String): Boolean {
        val length = line.length
        for (i in 0 until length / 2) {
            if (line[i] != line[length - i - 1]) return false
        }
        return true
    }
}
