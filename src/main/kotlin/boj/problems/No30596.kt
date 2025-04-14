package boj.problems

import java.io.BufferedReader

class No30596 {
    fun solve(input: BufferedReader): String {
        val sticks = List(4) { input.readLine().toInt() }.sorted()
        return (sticks[0] * sticks[2]).toString()
    }
}
