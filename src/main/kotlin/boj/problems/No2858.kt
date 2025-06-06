package boj.problems

import java.io.BufferedReader

class No2858 {
    fun solve(input: BufferedReader): String {
        val (r, b) = input.readLine().split(" ").map { it.toInt() }

        for (l in 3..(r + b)) {
            if ((r + b) % l != 0) continue
            val w = (r + b) / l

            if ((l - 2) * (w - 2) == b) {
                val max = maxOf(l, w)
                val min = minOf(l, w)
                return "$max $min"
            }
        }

        return "No solution"
    }
}
