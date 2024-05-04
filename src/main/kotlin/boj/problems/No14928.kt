package boj.problems

import java.io.BufferedReader

class No14928 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine()
        var temp = 0L
        for (i in number.indices) {
            temp = (temp * 10 + (number[i] - '0')) % 20000303
        }

        return temp.toString()
    }
}
