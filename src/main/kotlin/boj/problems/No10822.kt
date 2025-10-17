package boj.problems

import java.io.BufferedReader

class No10822 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        return (str.split(",").sumOf { it.toInt() }).toString()
    }
}
