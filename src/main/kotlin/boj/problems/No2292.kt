package boj.problems

import java.io.BufferedReader

class No2292 {
    private companion object {
        const val CENTER: Long = 1L
        const val RING_INC: Long = 6L
    }

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()
        if (n == CENTER) return "1"

        var layers = 1L
        var maxInLayer = CENTER

        while (maxInLayer < n) {
            maxInLayer += RING_INC * layers
            layers++
        }
        return layers.toString()
    }
}
