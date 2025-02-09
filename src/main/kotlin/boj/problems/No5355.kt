package boj.problems

import java.io.BufferedReader

class No5355 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val tokens = input.readLine().split(" ")
            var num = tokens[0].toDouble()

            for (i in 1 until tokens.size) {
                when (tokens[i]) {
                    "@" -> num *= 3
                    "%" -> num += 5
                    "#" -> num -= 7
                }
            }

            result.append(String.format("%.2f\n", num))
        }

        return result.toString().trim()
    }
}
