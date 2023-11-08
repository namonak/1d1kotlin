package boj.problems

import java.io.BufferedReader

object No1476 {
    fun solve(input: BufferedReader): String {
        val (e, s, m) = input.readLine().split(" ").map { it.toInt() }
        var year = 1
        while (true) {
            if ((year - e) % 15 == 0 && (year - s) % 28 == 0 && (year - m) % 19 == 0) {
                return year.toString()
            }
            year++
        }
    }
}
