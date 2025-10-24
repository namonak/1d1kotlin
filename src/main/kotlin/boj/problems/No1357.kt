package boj.problems

import java.io.BufferedReader

class No1357 {
    fun solve(input: BufferedReader): String {
        val (x, y) = input.readLine().split(" ").map { it.reversed().toInt() }
        return (x + y).toString().reversed().toInt().toString()
    }
}
