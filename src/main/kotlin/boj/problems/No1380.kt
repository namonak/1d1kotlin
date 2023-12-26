package boj.problems

import java.io.BufferedReader

object No1380 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        var case = 1
        while (true) {
            val n = input.readLine().toInt()
            if (n == 0) break

            val names = (1..n).map { input.readLine() }
            val numbers = (1 until 2 * n).map { input.readLine().split(" ")[0].toInt() }
            val uniqueNumber = numbers.groupBy { it }.filter { it.value.size == 1 }.keys.first()

            sb.append("$case ${names[uniqueNumber - 1]}\n")
            case++
        }
        return sb.toString().trimEnd()
    }
}
