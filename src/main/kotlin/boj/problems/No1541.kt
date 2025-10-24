package boj.problems

import java.io.BufferedReader

class No1541 {
    fun solve(input: BufferedReader): String {
        val formular = input.readLine()
        val numbers = formular.split("-")
        val first = numbers[0].split("+").sumOf { it.toInt() }
        val rest = numbers.drop(1).sumOf { it ->
            it.split("+").sumOf { it.toInt() }
        }

        return (first - rest).toString()
    }
}
