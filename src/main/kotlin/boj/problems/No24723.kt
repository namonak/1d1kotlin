package boj.problems

import java.io.BufferedReader

class No24723 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        return (1 shl n).toString()
    }
}
