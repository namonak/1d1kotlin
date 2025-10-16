package boj.problems

import java.io.BufferedReader

class No2440 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        for (i in n downTo 1) {
            for (j in 1..i) {
                result.append("*")
            }
            result.append("\n")
        }
        return result.toString().trimEnd()
    }
}
