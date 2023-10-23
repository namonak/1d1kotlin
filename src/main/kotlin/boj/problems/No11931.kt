package boj.problems

import java.io.BufferedReader

fun main() {
    println(No11931.solve(System.`in`.bufferedReader()))
}

object No11931 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = mutableListOf<Int>()
        repeat(n) {
            numbers.add(input.readLine().toInt())
        }
        return numbers.sortedDescending().joinToString("\n")
    }
}
