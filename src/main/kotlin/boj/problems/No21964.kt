package boj.problems

import java.io.BufferedReader

object No21964 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val s = input.readLine()
        return s.substring(s.length - 5)
    }
}
