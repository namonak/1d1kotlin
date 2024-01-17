package boj.problems

import java.io.BufferedReader

object No10797 {
    fun solve(input: BufferedReader): String {
        val day = input.readLine().toInt()
        val cars = input.readLine().split(" ").map { it.toInt() }
        return cars.count { it == day }.toString()
    }
}
