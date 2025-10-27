package boj.problems

import java.io.BufferedReader

class No2745 {
    fun solve(input: BufferedReader): String {
        val (n, b) = input.readLine().split(" ")
        val base = b.toInt()
        var result = 0
        var pow = 1
        for (i in n.length - 1 downTo 0) {
            val c = n[i]
            result += (if (c in '0'..'9') c - '0' else c - 'A' + 10) * pow
            pow *= base
        }
        return result.toString()
    }
}
