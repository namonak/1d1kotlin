package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2217.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No2217 {
    fun solve(input: BufferedReader): Int {
        val n = input.readLine().toInt()
        val ropes = mutableListOf<Int>()
        var weight = 0

        repeat(n) {
            ropes.add(input.readLine().toInt())
        }
        ropes.sort()

        for (i in ropes.indices) {
            weight = maxOf(weight, ropes[i] * (n - i))
        }

        return weight
    }
}
