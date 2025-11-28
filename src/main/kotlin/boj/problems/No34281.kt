package boj.problems

import java.io.BufferedReader

class No34281 {
    fun solve(input: BufferedReader): String {
        val width = input.readLine().toInt()
        val length = input.readLine().toInt()
        return (width * length).toString()
    }
}
