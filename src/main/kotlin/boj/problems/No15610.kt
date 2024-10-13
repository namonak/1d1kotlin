package boj.problems

import java.io.BufferedReader
import java.util.Scanner
import kotlin.math.sqrt

class No15610 {
    fun solve(input: BufferedReader): String {
        val a = Scanner(input).nextDouble()
        return (sqrt(a) * 4).toString()
    }
}
