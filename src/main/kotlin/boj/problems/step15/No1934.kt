package boj.problems.step15

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1934.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No1934 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val results = mutableListOf<Int>()

        repeat(n) {
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            val d = gcd(a, b)

            results.add(a * b / d)
        }

        return results.joinToString("\n")
    }

    private fun gcd(
        a: Int,
        b: Int
    ): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
