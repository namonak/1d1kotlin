package boj.problems

import java.io.BufferedReader

class No11718 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val str = input.readLine()
            if (str == null || str.isEmpty()) {
                break
            }
            result.append("$str\n")
        }

        return result.toString().trimEnd()
    }
}
