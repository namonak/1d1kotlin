package boj.problems.step15

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1735.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No1735 {
    fun solve(input: BufferedReader): String {
        val (a1, b1) = input.readLine().split(" ").map { it.toInt() }
        val (a2, b2) = input.readLine().split(" ").map { it.toInt() }

        val a = a1 * b2 + a2 * b1
        val b = b1 * b2

        return "${a / gcd(a, b)} ${b / gcd(a, b)}"
    }

    private fun gcd(
        a: Int,
        b: Int
    ): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
