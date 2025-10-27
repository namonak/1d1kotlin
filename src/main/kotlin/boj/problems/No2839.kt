package boj.problems

import java.io.BufferedReader

class No2839 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var five = n / 5
        var three: Int
        var result = -1

        while (five >= 0) {
            if ((n - five * 5) % 3 == 0) {
                three = (n - five * 5) / 3
                result = five + three
                break
            }
            five--
        }

        return result.toString()
    }
}
