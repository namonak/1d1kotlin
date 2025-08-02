package boj.problems

import java.io.BufferedReader

class No25628 {
    fun solve(input: BufferedReader): String {
        val (buns, patties) = input.readLine().split(" ").map { it.toInt() }
        return "${minOf(buns / 2, patties)}"
    }
}
