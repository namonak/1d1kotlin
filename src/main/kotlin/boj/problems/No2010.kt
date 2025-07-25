package boj.problems

import java.io.BufferedReader

class No2010 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val plugs = List(n) { input.readLine().toInt() }
        return (plugs.sum() - (n - 1)).toString()
    }
}
