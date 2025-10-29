package boj.problems

import java.io.BufferedReader

class No10820 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        var line: String?
        while (input.readLine().also { line = it } != null) {
            val (lower, upper, number, space) = line!!.fold(listOf(0, 0, 0, 0)) { acc, c ->
                when (c) {
                    in 'a'..'z' -> acc.toMutableList().apply { set(0, acc[0] + 1) }
                    in 'A'..'Z' -> acc.toMutableList().apply { set(1, acc[1] + 1) }
                    in '0'..'9' -> acc.toMutableList().apply { set(2, acc[2] + 1) }
                    ' ' -> acc.toMutableList().apply { set(3, acc[3] + 1) }
                    else -> acc
                }
            }
            result.append("$lower $upper $number $space\n")
        }
        return result.toString().trimEnd()
    }
}
