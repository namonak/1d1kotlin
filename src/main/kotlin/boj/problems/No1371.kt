package boj.problems

import java.io.BufferedReader

object No1371 {
    fun solve(input: BufferedReader): String {
        val alphabet = IntArray(26)
        var line: String?
        while (input.readLine().also { line = it } != null) {
            line?.filter { it.isLetter() }?.forEach { alphabet[it - 'a']++ }
        }
        val max = alphabet.maxOrNull() ?: 0
        return alphabet.mapIndexed { index, i -> index to i }
            .filter { it.second == max }
            .joinToString("") {
                "${'a' + it.first}"
            }
    }
}
