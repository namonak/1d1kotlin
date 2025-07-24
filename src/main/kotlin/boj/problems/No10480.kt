package boj.problems

import java.io.BufferedReader

class No10480 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val results = StringBuilder()

        repeat(n) {
            val number = input.readLine().toInt()
            results.append("$number is ${if (number % 2 == 0) "even" else "odd"}\n")
        }

        return results.toString().trimEnd()
    }
}
