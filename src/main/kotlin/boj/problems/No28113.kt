package boj.problems

import java.io.BufferedReader
import kotlin.math.max

class No28113 {
    fun solve(input: BufferedReader): String {
        val (n, a, b) = input.readLine().split(" ").map { it.toInt() }

        val subwayTime = max(n, b)

        return if (a < subwayTime) "Bus" else if (a > subwayTime) "Subway" else "Anything"
    }
}
