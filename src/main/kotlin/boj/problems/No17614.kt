package boj.problems

import java.io.BufferedReader

class No17614 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var count = 0
        for (i in 1..n) {
            count += i.toString().count { it == '3' || it == '6' || it == '9' }
        }
        return count.toString()
    }
}
