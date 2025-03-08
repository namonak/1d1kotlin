package boj.problems

import java.io.BufferedReader

class No9625 {
    fun solve(input: BufferedReader): String {
        val K = input.readLine().toInt()
        var A = 1
        var B = 0

        repeat(K) {
            val newA = B
            val newB = A + B
            A = newA
            B = newB
        }

        return "$A $B"
    }
}
