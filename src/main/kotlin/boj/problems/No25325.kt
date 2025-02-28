package boj.problems

import java.io.BufferedReader

class No25325 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val studentNames = input.readLine().split(" ")
        val popularity = mutableMapOf<String, Int>()

        for (name in studentNames) {
            popularity[name] = 0
        }

        repeat(n) {
            val likes = input.readLine().split(" ")
            for (liked in likes) {
                popularity[liked] = popularity.getOrDefault(liked, 0) + 1
            }
        }

        val sortedStudents = popularity.entries
            .sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy { it.key })

        return sortedStudents.joinToString("\n") { "${it.key} ${it.value}" }
    }
}
