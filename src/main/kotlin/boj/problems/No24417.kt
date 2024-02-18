package boj.problems

import java.io.BufferedReader

object No24417 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var a = 1L
        var b = 1L
        for (i in 2 until n) {
            var tmp = a + b
            if (tmp > 1000000006) tmp -= 1000000007
            a = b
            b = tmp
        }

        return "$b ${n - 2}"
    }
}
