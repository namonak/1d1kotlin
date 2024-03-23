package boj.problems

import java.io.BufferedReader

class No2810 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val s = input.readLine()
        val count = s.replace("LL", "L").length + 1

        return minOf(n, count).toString()
    }
}
