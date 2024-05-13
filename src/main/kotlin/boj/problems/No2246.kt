package boj.problems

import java.io.BufferedReader

class No2246 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val condos = mutableListOf<Pair<Int, Int>>()

        for (i in 1..n) {
            val (d, c) = input.readLine().split(' ').map { it.toInt() }
            condos.add(Pair(d, c))
        }

        condos.sortWith(compareBy({ it.first }, { it.second }))

        var minCost = Int.MAX_VALUE
        var count = 0
        for (condo in condos) {
            if (condo.second < minCost) {
                minCost = condo.second
                count++
            }
        }

        return count.toString()
    }
}
