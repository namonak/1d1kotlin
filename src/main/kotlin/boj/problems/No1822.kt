package boj.problems

import java.io.BufferedReader

class No1822 {
    fun solve(input: BufferedReader): String {
        val (_, _) = input.readLine().split(" ").map { it.toInt() }
        val aSet = input.readLine().split(" ").map { it.toInt() }.toSet()
        val bSet = input.readLine().split(" ").map { it.toInt() }.toSet()

        val resultSet = aSet.minus(bSet)
        return "${resultSet.size}\n${resultSet.sorted().joinToString(" ")}".trimEnd()
    }
}
