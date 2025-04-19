package boj.problems

import java.io.BufferedReader

class No23375 {
    fun solve(input: BufferedReader): String {
        val (x, y) = input.readLine().split(" ").map { it.toInt() }
        val r = input.readLine().toInt()
        val result = StringBuilder()

        result.append("${x + r} ${y + r}\n")
        result.append("${x + r} ${y - r}\n")
        result.append("${x - r} ${y - r}\n")
        result.append("${x - r} ${y + r}")

        return result.toString()
    }
}
