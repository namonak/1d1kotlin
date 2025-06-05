package boj.problems

import java.io.BufferedReader

class No4641 {
    fun solve(input: BufferedReader): String {
        val results = StringBuilder()
        while (true) {
            val line = input.readLine() ?: break
            if (line == "-1") break

            val numbers = line.split(" ").map { it.toInt() }.filter { it != 0 }
            val count = numbers.count { num -> numbers.any { it == num * 2 } }
            results.append(count).append("\n")
        }
        return results.toString().trim()
    }
}
