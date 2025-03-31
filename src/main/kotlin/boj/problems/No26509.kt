package boj.problems

import java.io.BufferedReader

class No26509 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = buildString {
            repeat(n) {
                val tri1 = input.readLine().split(" ").map { it.toInt() }.sorted()
                val tri2 = input.readLine().split(" ").map { it.toInt() }.sorted()

                if (isRightTriangle(tri1) && isRightTriangle(tri2) && tri1 == tri2) {
                    appendLine("YES")
                } else {
                    appendLine("NO")
                }
            }
        }
        return result.trim()
    }

    private fun isRightTriangle(sides: List<Int>): Boolean {
        val (a, b, c) = sides
        return a * a + b * b == c * c
    }
}
