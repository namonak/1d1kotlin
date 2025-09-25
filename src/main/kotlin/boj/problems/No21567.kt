package boj.problems

import java.io.BufferedReader

class No21567 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().trim().toLong()
        val b = input.readLine().trim().toLong()
        val c = input.readLine().trim().toLong()

        val product = a * b * c
        val counts = IntArray(10)

        product.toString().forEach { ch ->
            counts[ch - '0']++
        }

        return buildString {
            counts.forEach { appendLine(it) }
        }.trimEnd()
    }
}
