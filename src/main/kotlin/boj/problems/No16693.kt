package boj.problems

import java.io.BufferedReader

class No16693 {
    fun solve(input: BufferedReader): String {
        val (a1, p1) = input.readLine().split(" ").map { it.toInt() }
        val (r1, p2) = input.readLine().split(" ").map { it.toInt() }

        val sliceValue = a1.toDouble() / p1.toDouble()
        val wholePizzaValue = (Math.PI * r1 * r1) / p2.toDouble()

        return if (wholePizzaValue > sliceValue) "Whole pizza" else "Slice of pizza"
    }
}
