package boj.problems

import java.io.BufferedReader

fun main() {
    println(No2490.solve(System.`in`.bufferedReader()))
}

object No2490 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        repeat(3) {
            val count = input.readLine().split(" ").count { it == "0" }
            result.append(
                when (count) {
                    0 -> "E"
                    1 -> "A"
                    2 -> "B"
                    3 -> "C"
                    4 -> "D"
                    else -> ""
                }
            ).append("\n")
        }
        return result.toString().trimEnd()
    }
}
