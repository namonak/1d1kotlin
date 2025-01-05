package boj.problems

import java.io.BufferedReader

class No27160 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val fruitCounts = mutableMapOf(
            "STRAWBERRY" to 0,
            "BANANA" to 0,
            "LIME" to 0,
            "PLUM" to 0
        )

        repeat(n) {
            val (fruit, countStr) = input.readLine().split(" ")
            val count = countStr.toInt()

            fruitCounts[fruit] = fruitCounts.getValue(fruit) + count
        }

        return if (fruitCounts.values.any { it == 5 }) "YES" else "NO"
    }
}
