package boj.problems

import java.io.BufferedReader

class No26502 {
    fun solve(input: BufferedReader): String {
        val decodeMap = mapOf(
            'y' to 'a',
            'a' to 'e',
            'e' to 'i',
            'i' to 'o',
            'o' to 'u',
            'u' to 'y'
        )

        val output = StringBuilder()
        val n = input.readLine().toInt()

        repeat(n) {
            val line = input.readLine()
            val decodedLine = line.map { ch ->
                when {
                    ch.lowercaseChar() in decodeMap.keys -> {
                        val decodedChar = decodeMap[ch.lowercaseChar()]!!
                        if (ch.isUpperCase()) decodedChar.uppercaseChar() else decodedChar
                    }
                    else -> ch
                }
            }.joinToString("")
            output.appendLine(decodedLine)
        }

        return output.toString().trimEnd()
    }
}
