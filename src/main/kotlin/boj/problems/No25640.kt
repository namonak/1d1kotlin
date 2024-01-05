package boj.problems

import java.io.BufferedReader

object No25640 {
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
