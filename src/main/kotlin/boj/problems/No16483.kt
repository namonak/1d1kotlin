package boj.problems

import java.io.BufferedReader

class No16483 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        return ((t * t) / 4).toString()
    }
}
