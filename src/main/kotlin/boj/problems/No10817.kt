package boj.problems

import java.io.BufferedReader

private const val SECOND_NUMBER = 1

class No10817 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toInt() }
        return listOf(a, b, c).sorted()[SECOND_NUMBER].toString()
    }
}
