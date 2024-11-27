package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No20949 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val monitors = mutableListOf<Triple<Double, Int, Int>>()

        for (i in 1..n) {
            val (w, h) = input.readLine().split(" ").map { it.toInt() }
            val ppi = sqrt(w.toDouble() * w + h.toDouble() * h)
            monitors.add(Triple(ppi, i, i))
        }

        monitors.sortWith(compareByDescending<Triple<Double, Int, Int>> { it.first }.thenBy { it.second })

        return monitors.joinToString("\n") { it.second.toString() }
    }
}
