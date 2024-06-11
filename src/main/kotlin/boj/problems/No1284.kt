package boj.problems

import java.io.BufferedReader

class No1284 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        while (true) {
            val n = input.readLine().toInt()
            if (n == 0) break
            val sum = n.toString().sumBy {
                when (it) {
                    '1' -> 2
                    '0' -> 4
                    else -> 3
                }
            } + n.toString().length + 1
            result.append(sum).append("\n")
        }
        return result.toString().trimEnd()
    }
}
