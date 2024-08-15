package boj.problems

import java.io.BufferedReader

class No5358 {
    fun solve(input: BufferedReader): String {
        val result = mutableListOf<String>()

        input.forEachLine { line ->
            val correctedLine = line
                .replace('i', '1')
                .replace('e', 'i')
                .replace('1', 'e')
                .replace('I', '1')
                .replace('E', 'I')
                .replace('1', 'E')
            result.add(correctedLine)
        }

        return result.joinToString("\n")
    }
}
