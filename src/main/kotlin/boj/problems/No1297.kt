package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No1297 {
    fun solve(input: BufferedReader): String {
        val (diagonal, height, width) = input.readLine().split(" ").map { it.toInt() }
        val ratio = diagonal / sqrt((height * height + width * width).toDouble())
        return "${(height * ratio).toInt()} ${(width * ratio).toInt()}"
    }
}
