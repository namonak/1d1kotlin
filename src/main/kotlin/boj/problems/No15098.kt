package boj.problems

import java.io.BufferedReader

class No15098 {
    fun solve(input: BufferedReader): String {
        val words = input.readLine().trim().split(" ")
        return if (words.size == words.toSet().size) "yes" else "no"
    }
}
