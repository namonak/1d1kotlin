package boj.problems

import java.io.BufferedReader

class No16212 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val arr = input.readLine().split(" ").map { it.toInt() }.toIntArray()

        arr.sort()

        return arr.joinToString(" ")
    }
}
