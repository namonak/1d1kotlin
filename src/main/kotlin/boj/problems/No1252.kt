package boj.problems

import java.io.BufferedReader

class No1252 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ")
        val sum = a.toBigInteger(2) + b.toBigInteger(2)
        return sum.toString(2)
    }
}
