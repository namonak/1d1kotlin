package boj.problems

import java.io.BufferedReader

object No10824 {
    fun solve(input: BufferedReader): String {
        val numbers = input.readLine().split(" ")
        val ab = numbers[0] + numbers[1]
        val cd = numbers[2] + numbers[3]
        return (ab.toLong() + cd.toLong()).toString()
    }
}
