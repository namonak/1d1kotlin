package boj.problems

import java.io.BufferedReader

class No11596 {
    fun solve(input: BufferedReader): String {
        val t1 = input.readLine().split(" ").map { it.toInt() }
        val t2 = input.readLine().split(" ").map { it.toInt() }

        val sortedT1 = t1.sorted()
        val sortedT2 = t2.sorted()

        val isT1Right = isRightTriangle(t1)
        val isT2Right = isRightTriangle(t2)

        return if (isT1Right && isT2Right && sortedT1 == sortedT2) {
            "YES"
        } else {
            "NO"
        }
    }

    private fun isRightTriangle(sides: List<Int>): Boolean {
        val sorted = sides.sorted()
        val (a, b, c) = sorted
        return a * a + b * b == c * c
    }
}
