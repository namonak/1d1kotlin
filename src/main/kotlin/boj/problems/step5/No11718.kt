package boj.problems.step5

import java.io.BufferedReader

object No11718 {
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
