package boj.problems

import java.io.BufferedReader

class No11023 {
    fun solve(input: BufferedReader): String {
        return input.readLine().split(" ").sumOf { it.toInt() }.toString()
    }
}
