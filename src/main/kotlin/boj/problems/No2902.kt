package boj.problems

import java.io.BufferedReader

class No2902() {
    fun solve(input: BufferedReader): String {
        return input.readLine().split("-").joinToString("") { it.first().toString() }
    }
}
