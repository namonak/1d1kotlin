package boj.problems.step15

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No13241.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No13241 {
    fun solve(input: BufferedReader): Long {
        val (a, b) = input.readLine().split("\\s+".toRegex()).map { it.toLong() }

        return a * b / gcd(a, b)
    }

    private fun gcd(
        a: Long,
        b: Long
    ): Long {
        return if (b == 0L) a else gcd(b, a % b)
    }
}
