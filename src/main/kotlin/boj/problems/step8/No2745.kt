package boj.problems.step8

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2745.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

class No2745 {
    companion object {
        fun solve(input: BufferedReader): Int {
            val (n, b) = input.readLine().split(" ")
            val base = b.toInt()
            var result = 0
            var pow = 1
            for (i in n.length - 1 downTo 0) {
                val c = n[i]
                result += (if (c in '0'..'9') c - '0' else c - 'A' + 10) * pow
                pow *= base
            }
            return result
        }
    }
}
