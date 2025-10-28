package boj.problems

import java.io.BufferedReader

class No11557 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(t) {
            val n = input.readLine().toInt()
            val univs = mutableListOf<Pair<String, Int>>()
            repeat(n) {
                val (name, drink) = input.readLine().split(" ")
                univs.add(name to drink.toInt())
            }
            sb.append(univs.maxByOrNull { it.second }!!.first).append("\n")
        }
        return sb.toString().trimEnd()
    }
}
