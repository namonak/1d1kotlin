package boj.problems.step14

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1269.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No1269 {
    fun solve(input: BufferedReader): Int {
        val (_, _) = input.readLine().split(" ").map { it.toInt() }
        val aSet = input.readLine().split(" ").map { it.toInt() }.toSet()
        val bSet = input.readLine().split(" ").map { it.toInt() }.toSet()

        return (aSet - bSet).size + (bSet - aSet).size
    }
}
