package boj.problems

import java.io.BufferedReader

class No5532 {
    fun solve(input: BufferedReader): String {
        val l = input.readLine().toInt()
        val a = input.readLine().toInt()
        val b = input.readLine().toInt()
        val c = input.readLine().toInt()
        val d = input.readLine().toInt()

        val korean = if (a % c == 0) a / c else a / c + 1
        val math = if (b % d == 0) b / d else b / d + 1

        return (l - korean.coerceAtLeast(math)).toString()
    }
}
