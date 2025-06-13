package boj.problems

import java.io.BufferedReader

class No30310 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val a = input.readLine().split(" ").map { it.toLong() }.toMutableList()
        a.sort()
        val result = a[0] + a[1]

        return result.toString()
    }
}
