package boj.problems

import java.io.BufferedReader

class No26566 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val results = mutableListOf<String>()

        repeat(n) {
            val (a1, p1) = input.readLine().split(" ").map { it.toDouble() }
            val (r1, p2) = input.readLine().split(" ").map { it.toDouble() }

            val sliceValue = a1 / p1
            val wholeValue = (Math.PI * r1 * r1) / p2

            results.add(
                if (sliceValue > wholeValue) "Slice of pizza"
                else "Whole pizza"
            )
        }

        return results.joinToString("\n").trimEnd()
    }
}
