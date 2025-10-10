package boj.problems

import java.io.BufferedReader

class No9625 {
    fun solve(input: BufferedReader): String {
        val k = input.readLine().toInt()
        var a = 1
        var b = 0

        repeat(k) {
            val newA = b
            val newB = a + b
            a = newA
            b = newB
        }

        return "$a $b"
    }
}
