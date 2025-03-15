package boj.problems

import java.io.BufferedReader

class No17520 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val mod = 16769023

        var prev = LongArray(3)
        var curr = LongArray(3)

        prev[0] = 1
        prev[2] = 1

        for (i in 2..n) {
            curr.fill(0)
            for (d in -1..1) {
                val idx = d + 1
                val count = prev[idx]

                if (count == 0L) continue

                if (d + 1 <= 1) {
                    curr[d + 1 + 1] = (curr[d + 1 + 1] + count) % mod
                }
                if (d - 1 >= -1) {
                    curr[d - 1 + 1] = (curr[d - 1 + 1] + count) % mod
                }
            }
            val tmp = prev
            prev = curr
            curr = tmp
        }

        val result = (prev[0] + prev[1] + prev[2]) % mod
        return "$result"
    }
}
