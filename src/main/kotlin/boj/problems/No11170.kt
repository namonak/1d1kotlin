package boj.problems

import java.io.BufferedReader

class No11170 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val (n, m) = input.readLine().split(" ").map { it.toInt() }
            var count = 0
            for (i in n..m) {
                count += i.toString().count { it == '0' }
            }
            result.appendLine(count)
        }

        return result.toString().trimEnd()
    }
}
