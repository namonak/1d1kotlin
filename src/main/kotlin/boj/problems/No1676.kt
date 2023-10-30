package boj.problems

import java.io.BufferedReader

object No1676 {
    fun solve(input: BufferedReader): String {
        var count = 0
        var n = input.readLine().toInt()

        while (n >= 5) {
            count += n / 5
            n /= 5
        }

        return count.toString()
    }
}
