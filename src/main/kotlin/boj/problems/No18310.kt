package boj.problems

import java.io.BufferedReader

class No18310 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val houses = input.readLine().split(" ").map { it.toInt() }.sorted()
        return houses[(n - 1) / 2].toString()
    }
}
