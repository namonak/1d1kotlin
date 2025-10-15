package boj.problems

import java.io.BufferedReader

class No11365 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        var line = input.readLine()
        while (line != "END") {
            result.append(line.reversed())
            result.append("\n")
            line = input.readLine()
        }
        return result.toString()
    }
}
