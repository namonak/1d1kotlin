package boj.problems

import java.io.BufferedReader

class No31562 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val songs = mutableMapOf<String, String>()
        val songFrequency = mutableMapOf<String, Int>()

        repeat(n) {
            val parts = input.readLine().split(" ")
            val title = parts[1]
            val notes = parts.subList(2, 9).joinToString("")
            val firstThreeNotes = notes.substring(0, 3)

            if (songs.containsKey(firstThreeNotes)) {
                songFrequency[firstThreeNotes] = 2
            } else {
                songs[firstThreeNotes] = title
                songFrequency[firstThreeNotes] = 1
            }
        }

        repeat(m) {
            val query = input.readLine().split(" ").joinToString("")
            val count = songFrequency.getOrDefault(query, 0)

            when (count) {
                0 -> result.append("!\n")
                1 -> result.append("${songs[query]}\n")
                else -> result.append("?\n")
            }
        }

        return result.toString().trimEnd()
    }
}
