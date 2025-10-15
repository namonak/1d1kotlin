package boj.problems.step8

import java.io.BufferedReader
import kotlin.math.pow

class No2903 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        return (2.0.pow(n) + 1).pow(2).toInt().toString()
    }
}
