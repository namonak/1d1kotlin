package boj.problems

import java.io.BufferedReader

class No5575 {
    data class Time(val h1: Int, val m1: Int, val s1: Int, val h2: Int, val m2: Int, val s2: Int)

    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        repeat(3) {
            val (h1, m1, s1, h2, m2, s2) = input.readLine().split(" ").map { it.toInt() }.let {
                Time(it[0], it[1], it[2], it[3], it[4], it[5])
            }
            val (h, m, s) = timeCard(h1, m1, s1, h2, m2, s2)
            sb.append("$h $m $s\n")
        }
        return sb.toString().trim()
    }

    private fun timeCard(
        h1: Int,
        m1: Int,
        s1: Int,
        h2: Int,
        m2: Int,
        s2: Int
    ): Triple<Int, Int, Int> {
        var s = s2 - s1
        var m = m2 - m1
        var h = h2 - h1

        if (s < 0) {
            s += 60
            m -= 1
        }
        if (m < 0) {
            m += 60
            h -= 1
        }

        return Triple(h, m, s)
    }
}
