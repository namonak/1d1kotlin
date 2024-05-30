package boj.problems

import java.io.BufferedReader

class No30501 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val names = List(n) { input.readLine() }
        return names.single { it.contains('S') }
    }
}
