package boj.problems

import java.io.BufferedReader

class No27323 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().toInt()
        val b = input.readLine().toInt()

        return (a * b).toString()
    }
}
