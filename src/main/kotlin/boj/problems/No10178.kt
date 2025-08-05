package boj.problems

import java.io.BufferedReader

class No10178 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()

        repeat(t) {
            val (c, v) = input.readLine().split(" ").map { it.toInt() }
            val perChild = c / v
            val dadGets = c % v
            sb.append("You get $perChild piece(s) and your dad gets $dadGets piece(s).\n")
        }
        return sb.toString().trimEnd()
    }
}
