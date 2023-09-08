package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No16165.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No16165 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val groups = HashMap<String, List<String>>(n)
        val result = mutableListOf<String>()

        repeat(n) {
            val name = input.readLine()
            val number = input.readLine().toInt()
            groups[name] = MutableList(number) { input.readLine() }.sorted().toList()
        }

        repeat(m) {
            val value = input.readLine()
            val type = input.readLine().toInt()
            when (type) {
                0 -> groups[value]?.forEach { result.add(it) }
                1 -> {
                    for (key in groups.keys) {
                        if (groups[key]?.contains(value) == true) {
                            result.add(key)
                        }
                    }
                }
            }
        }
        return result.joinToString("\n").trimEnd()
    }
}
