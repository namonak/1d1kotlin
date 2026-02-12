package boj.problems

import java.io.BufferedReader

class No9612 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine()?.toIntOrNull() ?: return ""
        val words = List(n) { input.readLine() ?: "" }
        val frequencyMap = words.groupingBy { it }.eachCount()
        val maxEntry = frequencyMap.entries.maxWithOrNull(
            compareBy<Map.Entry<String, Int>> { it.value }
                .thenBy { it.key }
        )

        return maxEntry?.let { "${it.key} ${it.value}" } ?: ""
    }
}
