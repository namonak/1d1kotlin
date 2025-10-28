package boj.problems

import java.io.BufferedReader

class No10103 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var (a, b) = 100 to 100
        repeat(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            when {
                x > y -> b -= x
                x < y -> a -= y
            }
        }
        return "$a\n$b"
    }
}
