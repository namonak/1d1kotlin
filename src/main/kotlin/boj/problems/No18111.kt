package boj.problems

import java.io.BufferedReader

private const val MAX_HEIGHT = 256

class No18111 {
    fun solve(input: BufferedReader): String {
        val (n, _, b) = input.readLine().split(" ").map { it.toInt() }
        var min = MAX_HEIGHT
        var max = 0
        val heightFrequency = IntArray(MAX_HEIGHT + 1)

        repeat(n) {
            input.readLine().split(" ").map { it.toInt() }.forEach { v ->
                min = minOf(min, v)
                max = maxOf(max, v)
                heightFrequency[v]++
            }
        }

        var minTime = Int.MAX_VALUE
        var maxHeight = 0

        for (h in min..max) {
            var time = 0
            var block = b

            for (i in min..max) {
                if (i < h) {
                    time += (h - i) * heightFrequency[i]
                    block -= (h - i) * heightFrequency[i]
                } else if (i > h) {
                    time += (i - h) * 2 * heightFrequency[i]
                    block += (i - h) * heightFrequency[i]
                }
            }

            if (block >= 0 && time <= minTime) {
                minTime = time
                maxHeight = h
            }
        }

        return "$minTime $maxHeight"
    }
}
