package boj.problems

import java.io.BufferedReader

class No19944 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        return when {
            m == 1 || m == 2 -> "NEWBIE!"
            n < m -> "TLE!"
            else -> "OLDBIE!"
        }
    }
}
