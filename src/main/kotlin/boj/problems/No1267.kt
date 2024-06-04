package boj.problems

import java.io.BufferedReader

class No1267 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val callTimes = input.readLine().split(" ").map { it.toInt() }

        var y = 0
        var m = 0
        callTimes.forEach {
            y += (it / 30 + 1) * 10
            m += (it / 60 + 1) * 15
        }

        return when {
            y < m -> "Y $y"
            y > m -> "M $m"
            else -> "Y M $y"
        }
    }
}
