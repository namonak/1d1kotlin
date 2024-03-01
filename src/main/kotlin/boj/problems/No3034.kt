package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No3034 {
    fun solve(input: BufferedReader): String {
        val (n, w, h) = input.readLine().split(" ").map { it.toInt() }
        val max = sqrt((w * w + h * h).toDouble())
        val sb = StringBuilder()
        repeat(n) {
            val match = input.readLine().toInt()
            sb.append(if (max >= match) "DA\n" else "NE\n")
        }

        return sb.toString().trimEnd()
    }
}
