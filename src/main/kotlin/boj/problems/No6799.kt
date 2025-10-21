package boj.problems

import java.io.BufferedReader

class No6799 {
    data class Computer(
        val name: String,
        val ram: Int,
        val cpu: Int,
        val disk: Int,
    ) {
        val score: Int = 2 * ram + 3 * cpu + disk
    }

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        if (n == 0) {
            return ""
        }

        val computers = List(n) {
            val (name, r, s, d) = input.readLine().split(" ")
            Computer(name, r.toInt(), s.toInt(), d.toInt())
        }

        val sortedComputers = computers.sortedWith(
            compareByDescending<Computer> { it.score }
                .thenBy { it.name }
        )

        return sortedComputers
            .take(2)
            .joinToString("\n") { it.name }
    }
}
