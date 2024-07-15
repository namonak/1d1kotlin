package boj.problems

import java.io.BufferedReader

class No15813 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val name = input.readLine()
        var sum = 0
        for (i in 0 until n) {
            sum += name[i] - 'A' + 1
        }
        return sum.toString()
    }
}
