package boj.problems

import java.io.BufferedReader

object No1292 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toInt() }
        val list = mutableListOf<Int>()
        for (i in 1..b) {
            for (j in 1..i) {
                list.add(i)
            }
        }
        return list.subList(a - 1, b).sum().toString()
    }
}
