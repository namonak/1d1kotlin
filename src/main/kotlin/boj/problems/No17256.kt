package boj.problems

import java.io.BufferedReader

class No17256 {
    fun solve(input: BufferedReader): String {
        val (ax, ay, az) = input.readLine().split(" ").map { it.toInt() }
        val (cx, cy, cz) = input.readLine().split(" ").map { it.toInt() }
        return "${cx - az} ${cy / ay} ${cz - ax}"
    }
}
