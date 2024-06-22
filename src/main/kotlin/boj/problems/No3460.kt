package boj.problems

import java.io.BufferedReader

class No3460 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = mutableListOf<String>()
        repeat(t) {
            val n = input.readLine().toInt()
            val binary = n.toString(2)
            binary.reversed().forEachIndexed { index, c ->
                if (c == '1') {
                    result.add(index.toString())
                }
            }
        }
        return result.joinToString(" ")
    }
}
