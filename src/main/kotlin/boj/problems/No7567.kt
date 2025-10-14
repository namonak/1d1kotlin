package boj.problems

import java.io.BufferedReader

class No7567 {
    fun solve(input: BufferedReader): String {
        val bowlString = input.readLine()
        var height = 10

        for (i in 1 until bowlString.length) {
            height += if (bowlString[i] == bowlString[i - 1]) {
                5
            } else {
                10
            }
        }
        return height.toString()
    }
}
