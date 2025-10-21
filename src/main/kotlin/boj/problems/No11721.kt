package boj.problems

import java.io.BufferedReader

class No11721 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        val result = StringBuilder()
        str.forEachIndexed { index, c ->
            result.append(c)
            if (index % 10 == 9) {
                result.append("\n")
            }
        }
        return result.toString()
    }
}
