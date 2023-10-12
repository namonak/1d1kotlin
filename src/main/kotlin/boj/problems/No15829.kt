package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No15829.solve(input))

    input.close()
    output.close()
}

object No15829 {
    fun solve(input: BufferedReader): String {
        val l = input.readLine().toInt()
        val s = input.readLine()
        var r = 0L
        var m = 1L
        for (i in 0 until l) {
            r += (s[i] - 'a' + 1) * m
            m *= 31
            m %= 1234567891
            r %= 1234567891
        }
        return r.toString()
    }
}
