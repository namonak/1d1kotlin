package boj.problems

import java.io.BufferedReader

class No30236 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val n = input.readLine().toInt()
            val a = input.readLine().split(" ").map { it.toInt() }

            val b = mutableListOf<Int>()
            var current = 1

            for (i in 0 until n) {
                while (current == a[i] || (b.isNotEmpty() && current <= b.last())) {
                    current++
                }
                b.add(current)
                current++
            }

            result.appendLine(b.last())
        }

        return result.toString().trimEnd()
    }
}
