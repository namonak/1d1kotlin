package boj.problems

import java.io.BufferedReader

class No15727 {
    fun solve(input: BufferedReader): String {
        val l = input.readLine().toInt()
        return ((l + 4) / 5).toString()
    }
}
