package boj.problems

import java.io.BufferedReader

class No2217 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val ropes = mutableListOf<Int>()
        var weight = 0

        repeat(n) {
            ropes.add(input.readLine().toInt())
        }
        ropes.sort()

        for (i in ropes.indices) {
            weight = maxOf(weight, ropes[i] * (n - i))
        }

        return weight.toString()
    }
}
