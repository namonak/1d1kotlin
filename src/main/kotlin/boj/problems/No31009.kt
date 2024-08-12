package boj.problems

import java.io.BufferedReader

class No31009 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var jinjuFare = 0
        val expensiveCount: Int
        val inputs = mutableListOf<Pair<String, Int>>()

        repeat(n) {
            val (destination, fareStr) = input.readLine().split(" ")
            val fare = fareStr.toInt()
            inputs.add(destination to fare)

            if (destination == "jinju") {
                jinjuFare = fare
            }
        }

        expensiveCount = inputs.count { it.second > jinjuFare }

        return "$jinjuFare\n$expensiveCount"
    }
}
