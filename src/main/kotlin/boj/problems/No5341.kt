package boj.problems

import java.io.BufferedReader

class No5341 {
    fun solve(input: BufferedReader) =
        with(input) {
            val sb = StringBuilder()
            while (true) {
                val n = readLine().toInt()
                if (n == 0) break
                var sum = 0

                for (i in 1..n) {
                    sum += i
                }
                sb.appendLine(sum)
            }
            sb.toString().trimEnd()
        }
}
