package boj.problems

import java.io.BufferedReader

class No34217 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().trim().split(" ").map { it.toInt() }
        val (c, d) = input.readLine().trim().split(" ").map { it.toInt() }

        val hanyangTime = a + c
        val yongdapTime = b + d

        return when {
            hanyangTime < yongdapTime -> "Hanyang Univ."
            hanyangTime > yongdapTime -> "Yongdap"
            else -> "Either"
        }
    }
}
