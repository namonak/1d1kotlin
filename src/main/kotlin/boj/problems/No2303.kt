package boj.problems

import java.io.BufferedReader

class No2303 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val points = IntArray(n)

        repeat(n) { idx ->
            val cards = input.readLine().split(" ").map { it.toInt() }
            var max = 0

            for (i in 0 until cards.size - 2) {
                for (j in 1 + i until cards.size - 1) {
                    for (k in 1 + j until cards.size) {
                        val last = (cards[i] + cards[j] + cards[k]) % 10
                        max = maxOf(max, last)
                    }
                }
            }
            points[idx] = max
        }

        var maxIdx = 0
        for (i in 1 until points.size) {
            if (points[i] >= points[maxIdx]) {
                maxIdx = i
            }
        }

        return "${maxIdx + 1}"
    }
}
