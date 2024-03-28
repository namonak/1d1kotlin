package boj.problems

import java.io.BufferedReader

class No16430 {
    fun solve(bufferedReader: BufferedReader): String {
        val (a, b) = bufferedReader.readLine().split(" ").map { it.toInt() }
        return "${b - a} $b"
    }
}
