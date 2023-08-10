package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No23795.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No23795 {
    fun solve(input: BufferedReader): Int {
        var sum = 0
        while (true) {
            val n = input.readLine().toInt()
            if (n == -1) break
            sum += n
        }
        return sum
    }
}
