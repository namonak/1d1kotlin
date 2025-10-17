package boj.problems

import java.io.BufferedReader

class No25640 {
    fun solve(input: BufferedReader): String {
        val mbti = input.readLine()
        val n = input.readLine().toInt()
        var count = 0

        repeat(n) {
            if (input.readLine() == mbti) count++
        }

        return count.toString()
    }
}
