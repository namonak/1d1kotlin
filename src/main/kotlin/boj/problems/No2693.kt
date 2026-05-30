package boj.problems

import java.io.BufferedReader

class No2693 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = IntArray(n)

        repeat(n) { index ->
            val array = input.readLine().split(" ").map { it.toInt() }
            result[index] = array.sortedDescending()[2]
        }

        return result.joinToString("\n").trimEnd()
    }
}
