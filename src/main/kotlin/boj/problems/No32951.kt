package boj.problems

import java.io.BufferedReader

class No32951 {
    fun solve(input: BufferedReader): String {
        val year = input.readLine().toInt()
        return (year - 2024).toString()
    }
}
