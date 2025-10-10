package boj.problems

import java.io.BufferedReader
import kotlin.math.pow

class No1074 {
    private var count = 0

    fun solve(input: BufferedReader): String {
        val (n, r, c) = input.readLine().split(" ").map { it.toInt() }
        val size = (2.0).pow(n).toInt()

        findCount(size, r, c)

        return count.toString()
    }

    private fun findCount(
        size: Int,
        r: Int,
        c: Int
    ) {
        if (size == 1) return

        val half = size / 2

        if (r < half && c < half) {
            findCount(half, r, c)
        } else if (r < half && c >= half) {
            count += size * size / 4
            findCount(half, r, c - half)
        } else if (r >= half && c < half) {
            count += (size * size / 4) * 2
            findCount(half, r - half, c)
        } else {
            count += (size * size / 4) * 3
            findCount(half, r - half, c - half)
        }
    }
}
