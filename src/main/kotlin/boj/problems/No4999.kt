package boj.problems

import java.io.BufferedReader

class No4999 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine()
        val b = input.readLine()

        return if (a.length >= b.length) "go" else "no"
    }
}
