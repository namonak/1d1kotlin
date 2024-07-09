package boj.problems

import java.io.BufferedReader

class No8949 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ")

        val maxLength = maxOf(a.length, b.length)

        val aPadded = a.padStart(maxLength, '0')
        val bPadded = b.padStart(maxLength, '0')

        val result = StringBuilder()

        for (i in 0 until maxLength) {
            val sum = (aPadded[i] - '0') + (bPadded[i] - '0')
            result.append(sum)
        }

        return result.toString()
    }
}
