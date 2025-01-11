package boj.problems

import java.io.BufferedReader

class No6378 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        while (true) {
            val line = input.readLine() ?: break
            if (line == "0") {
                break
            }

            val sumOfDigits = line.fold(0) { acc, c -> acc + (c - '0') }
            val digitalRoot = if (sumOfDigits % 9 == 0) 9 else sumOfDigits % 9
            sb.append(digitalRoot).append("\n")
        }
        return sb.toString()
    }
}
