package boj.problems

import java.io.BufferedReader

class No2386 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        while (true) {
            val line = input.readLine()
            if (line == "#") break
            val (char, str) = line.split(" ", limit = 2)
            val count = str.lowercase().count { it == char[0] }
            sb.append("$char $count\n")
        }
        return sb.toString().trim()
    }
}
