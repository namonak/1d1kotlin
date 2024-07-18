package boj.problems

import java.io.BufferedReader

class No11179 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        return Integer.toBinaryString(n).reversed().toInt(2).toString()
    }
}
