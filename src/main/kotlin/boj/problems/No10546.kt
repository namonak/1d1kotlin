package boj.problems

import java.io.BufferedReader

class No10546 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val participants = mutableMapOf<String, Int>()
        repeat(n) {
            val name = input.readLine()
            participants[name] = (participants[name] ?: 0) + 1
        }
        repeat(n - 1) {
            val name = input.readLine()
            participants[name] = (participants[name] ?: 0) - 1
        }
        return participants.entries.first { it.value > 0 }.key
    }
}
