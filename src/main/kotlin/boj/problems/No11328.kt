package boj.problems

import java.io.BufferedReader

class No11328 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = mutableListOf<String>()
        repeat(n) {
            val (a, b) = input.readLine().split(" ")
            result.add(if (a.toCharArray().sorted() == b.toCharArray().sorted()) "Possible" else "Impossible")
        }
        return result.joinToString("\n")
    }
}
