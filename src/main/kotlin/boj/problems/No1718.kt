package boj.problems

import java.io.BufferedReader

class No1718 {
    fun solve(input: BufferedReader): String {
        val text = input.readLine()
        val key = input.readLine()
        val keyLength = key.length
        val result = StringBuilder()

        text.forEachIndexed { index, c ->
            if (c == ' ') {
                result.append(' ')
                return@forEachIndexed
            }

            val keyIndex = index % keyLength
            val keyChar = key[keyIndex]
            val shift = keyChar - 'a' + 1
            val newChar = if (c - shift < 'a') c - shift + 26 else c - shift
            result.append(newChar)
        }

        return result.toString()
    }
}
