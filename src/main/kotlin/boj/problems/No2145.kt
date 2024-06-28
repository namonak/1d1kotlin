package boj.problems

import java.io.BufferedReader

class No2145 {
    fun solve(input: BufferedReader): String {
        val results = StringBuilder()

        while (true) {
            val line = input.readLine()
            if (line == "0") break

            var num = line
            while (num.length > 1) {
                num = num.map { it - '0' }.sum().toString()
            }

            results.append(num).append("\n")
        }

        return results.toString().trimEnd()
    }
}
