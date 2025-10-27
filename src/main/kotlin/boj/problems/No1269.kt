package boj.problems

import java.io.BufferedReader

class No1269 {
    fun solve(input: BufferedReader): String {
        val (_, _) = input.readLine().split(" ").map { it.toInt() }
        val aSet = input.readLine().split(" ").map { it.toInt() }.toSet()
        val bSet = input.readLine().split(" ").map { it.toInt() }.toSet()

        return ((aSet - bSet).size + (bSet - aSet).size).toString()
    }
}
