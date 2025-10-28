package boj.problems

import java.io.BufferedReader

class No2605 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine().toInt()
        val students = input.readLine().split(" ").map { it.toInt() }
        val line = mutableListOf<Int>()
        for (i in 0 until number) {
            line.add(i - students[i], i + 1)
        }
        return line.joinToString(" ")
    }
}
