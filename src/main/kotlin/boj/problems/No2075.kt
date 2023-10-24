package boj.problems

import java.io.BufferedReader

fun main() = println(No2075.solve(System.`in`.bufferedReader()))

object No2075 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = mutableListOf<Int>()
        repeat(n) {
            val row = input.readLine().split(" ").map { it.toInt() }
            numbers.addAll(row)
        }
        return numbers.sortedDescending()[n - 1].toString()
    }
}
