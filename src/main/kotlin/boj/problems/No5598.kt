package boj.problems

import java.io.BufferedReader

object No5598 {
    fun solve(input: BufferedReader): String {
        return input.readLine().map { c ->
            if (c in 'A'..'C') {
                (c.code + 23).toChar()
            } else {
                (c.code - 3).toChar()
            }
        }.joinToString("")
    }
}
