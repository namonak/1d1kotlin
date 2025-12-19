package boj.problems

import java.io.BufferedReader

class No5349 {
    fun solve(reader: BufferedReader): String {
        val ssnCounts = mutableMapOf<String, Int>()

        while (true) {
            val line = reader.readLine()?.trim() ?: break
            if (line == "000-00-0000") break

            if (line.isNotEmpty()) {
                ssnCounts[line] = ssnCounts.getOrDefault(line, 0) + 1
            }
        }

        val duplicates = ssnCounts.filter { it.value > 1 }
            .keys
            .sorted()

        return duplicates.joinToString("\n")
    }
}
