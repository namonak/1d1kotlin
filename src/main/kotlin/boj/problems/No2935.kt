package boj.problems

import java.io.BufferedReader

class No2935 {
    fun solve(input: BufferedReader): String {
        val a = input.readLine().toBigInteger()
        val op = input.readLine()
        val b = input.readLine().toBigInteger()

        return if (op == "+") (a + b).toString() else (a * b).toString()
    }
}
