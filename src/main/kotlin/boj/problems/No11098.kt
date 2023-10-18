package boj.problems

import java.io.BufferedReader

fun main() {
    println(No11098.solve(System.`in`.bufferedReader()))
}

object No11098 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()

        repeat(n) {
            val p = input.readLine().toInt()
            var max = 0
            var maxName = ""
            repeat(p) {
                val (price, name) = input.readLine().split(" ")
                if (price.toInt() > max) {
                    max = price.toInt()
                    maxName = name
                }
            }
            sb.append("$maxName\n")
        }

        return sb.toString().trimEnd()
    }
}
