package boj.problems

import java.io.BufferedReader

class No14645 {
    fun solve(input: BufferedReader): String {
        val (n, _) = input.readLine().split(" ").map { it.toInt() }
        repeat(n) { input.readLine() }
        return "비와이"
    }
}
