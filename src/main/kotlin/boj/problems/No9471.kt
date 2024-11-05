package boj.problems

import java.io.BufferedReader

class No9471 {
    fun solve(input: BufferedReader): String {
        val p = input.readLine().toInt()
        val results = mutableListOf<String>()

        repeat(p) {
            val (n, m) = input.readLine().split(" ").map { it.toInt() }
            results.add("$n ${pisano(m)}")
        }

        return results.joinToString("\n")
    }

    private fun pisano(m: Int): Int {
        var previous = 1
        var current = 1
        var temp: Int
        var count = 0

        while (true) {
            temp = (previous + current) % m
            previous = current
            current = temp

            if (previous == 1 && current == 1) {
                return count + 1
            }
            count++
        }
    }
}
