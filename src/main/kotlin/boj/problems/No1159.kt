package boj.problems

import java.io.BufferedReader

class No1159 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val names = mutableMapOf<Char, Int>()

        repeat(n) {
            val name = input.readLine()
            names[name[0]] = names.getOrDefault(name[0], 0) + 1
        }

        val answer = names.filter { it.value >= 5 }
            .keys
            .joinToString("")
            .toList()
            .sorted()
            .joinToString("")

        return answer.ifEmpty { "PREDAJA" }
    }
}
