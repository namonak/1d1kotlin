package boj.problems

import java.io.BufferedReader

object No1271 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toBigInteger() }
        return "${n / m}\n${n % m}"
    }
}
