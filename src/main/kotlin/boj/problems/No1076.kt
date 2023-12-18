package boj.problems

import java.io.BufferedReader
import kotlin.math.pow

object No1076 {
    fun solve(input: BufferedReader): String {
        val colors = listOf("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
        val (first, second, third) = input.readLines().map { colors.indexOf(it) }
        val result = (first * 10 + second) * 10.0.pow(third)
        return result.toLong().toString()
    }
}
