package boj.problems

import java.io.BufferedReader

class No15819 {
    fun solve(input: BufferedReader): String {
        val (n, i) = input.readLine().split(" ").map { it.toInt() }
        val handles = (1..n).map { input.readLine() }
        return handles.sorted()[i - 1]
    }
}
