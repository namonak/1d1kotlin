package boj.problems

import java.io.BufferedReader

class No31403 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().toInt()
        val b = input.readLine().toInt()
        val c = input.readLine().toInt()
        return "${a + b - c}\n${(a.toString().plus(b)).toInt() - c}"
    }
}
