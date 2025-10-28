package boj.problems

import java.io.BufferedReader

class No2920 {
    fun solve(input: BufferedReader): String {
        val numbers = input.readLine().split(" ").map { it.toInt() }
        var result = ""

        for (i in 1 until numbers.size) {
            if (numbers[i - 1] + 1 == numbers[i]) {
                result = "ascending"
            } else if (numbers[i - 1] - 1 == numbers[i]) {
                result = "descending"
            } else {
                result = "mixed"
                break
            }
        }
        return result
    }
}
