package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2775.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No2775 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()

        for (i in 0 until t) {
            val k = input.readLine().toInt()
            val n = input.readLine().toInt()
            sb.append("${getPeople(k, n)}\n")
        }

        return sb.toString().trimEnd()
    }

    private fun getPeople(k: Int, n: Int): Int {
        if (k == 0) return n
        if (n == 1) return 1
        return getPeople(k - 1, n) + getPeople(k, n - 1)
    }
}
