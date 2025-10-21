package boj.problems

import java.io.BufferedReader

class No31867 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val k = input.readLine()

        var evenCount = 0
        var oddCount = 0

        for (char in k) {
            val digit = char - '0'
            if (digit % 2 == 0) {
                evenCount++
            } else {
                oddCount++
            }
        }

        return when {
            evenCount > oddCount -> "0"
            oddCount > evenCount -> "1"
            else -> "-1"
        }
    }
}
