package boj.problems

import java.io.BufferedReader

class No14501 {
    fun solve(input: BufferedReader): String {
        val days = input.readLine().toInt()
        val timeRequired = IntArray(days + 1)
        val profits = IntArray(days + 1)
        val maxProfitUpToDay = IntArray(days + 2)

        for (day in 1..days) {
            val (time, profit) = input.readLine().split(" ").map { it.toInt() }
            timeRequired[day] = time
            profits[day] = profit
        }

        for (day in days downTo 1) {
            if (day + timeRequired[day] > days + 1) {
                maxProfitUpToDay[day] = maxProfitUpToDay[day + 1]
            } else {
                maxProfitUpToDay[day] = maxOf(maxProfitUpToDay[day + 1], profits[day] + maxProfitUpToDay[day + timeRequired[day]])
            }
        }

        return maxProfitUpToDay[1].toString()
    }
}
