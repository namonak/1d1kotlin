package boj.problems

import java.io.BufferedReader

class No17388 {
    fun solve(input: BufferedReader): String {
        val (s, k, h) = input.readLine().split(" ").map { it.toInt() }
        val sum = s + k + h
        return when {
            sum >= 100 -> "OK"
            s < k && s < h -> "Soongsil"
            k < s && k < h -> "Korea"
            else -> "Hanyang"
        }
    }
}
