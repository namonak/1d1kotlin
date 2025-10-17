package boj.problems.step14

import java.io.BufferedReader

class No1269 {
    fun solve(input: BufferedReader): Int {
        val (_, _) = input.readLine().split(" ").map { it.toInt() }
        val aSet = input.readLine().split(" ").map { it.toInt() }.toSet()
        val bSet = input.readLine().split(" ").map { it.toInt() }.toSet()

        return (aSet - bSet).size + (bSet - aSet).size
    }
}
