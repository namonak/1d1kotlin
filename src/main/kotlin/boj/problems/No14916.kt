package boj.problems

import java.io.BufferedReader

class No14916 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var count = 0
        var five = n / 5
        var two = 0

        while (five >= 0) {
            if ((n - five * 5) % 2 == 0) {
                two = (n - five * 5) / 2
                break
            }
            five--
        }

        count = if (five < 0) -1 else five + two
        return count.toString()
    }
}
