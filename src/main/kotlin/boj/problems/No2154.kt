package boj.problems

import java.io.BufferedReader

object No2154 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine()
        val sequence = (1..number.toInt()).joinToString("")
        var result = 0

        for (i in sequence.indices) {
            if (result == 0 && sequence[i] == number[0]) {
                for (j in number.indices) {
                    if (sequence[i + j] != number[j]) {
                        break
                    }
                    if (j == number.length - 1) {
                        result = i + 1
                    }
                }
            }
        }

        return result.toString()
    }
}
