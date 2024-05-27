package boj.problems

import java.io.BufferedReader

class No30402 {
    fun solve(input: BufferedReader): String {
        val lines = input.readLines()
        val allPixels = lines.flatMap { it.split(" ") }

        return when {
            "w" in allPixels -> "chunbae"
            "b" in allPixels -> "nabi"
            "g" in allPixels -> "yeongcheol"
            else -> "none"
        }
    }
}
