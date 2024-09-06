package boj.problems

import java.io.BufferedReader

class No8437 {
    fun solve(input: BufferedReader): String {
        val total = input.readLine().toBigInteger()
        val diff = input.readLine().toBigInteger()
        val a = (total + diff) / 2.toBigInteger()
        val b = (total - diff) / 2.toBigInteger()
        return "$a\n$b"
    }
}
