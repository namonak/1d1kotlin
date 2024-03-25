package boj.problems

import java.io.BufferedReader

class No8370 {
    fun solve(reader: BufferedReader): String {
        val (n1, k1, n2, k2) = reader.readLine().split(" ").map { it.toInt() }
        return (n1 * k1 + n2 * k2).toString()
    }
}
