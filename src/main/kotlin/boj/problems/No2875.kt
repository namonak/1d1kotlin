package boj.problems

import java.io.BufferedReader

class No2875 {
    fun solve(input: BufferedReader): String {
        var (n, m, k) = input.readLine().split(" ").map { it.toInt() }
        var team = 0
        while (n >= 2 && m >= 1 && n + m >= k + 3) {
            n -= 2
            m -= 1
            team++
        }
        return team.toString()
    }
}
