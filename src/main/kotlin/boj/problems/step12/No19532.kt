package boj.problems.step12

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No19532.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No19532 {
    fun solve(input: BufferedReader): String {
        val numbers = input.readLine().split(" ").map { it.toInt() }
        val a = numbers[0]
        val b = numbers[1]
        val c = numbers[2]
        val d = numbers[3]
        val e = numbers[4]
        val f = numbers[5]

        for (x in -999..999) {
            for (y in -999..999) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    return "$x $y"
                }
            }
        }
        return ""
    }
}
