package boj.problems

import java.io.BufferedReader

object Morse {
    val CHAR_TO_CODE: Map<Char, String> = mapOf(
        'A' to ".-",
        'B' to "-...",
        'C' to "-.-.",
        'D' to "-..",
        'E' to ".",
        'F' to "..-.",
        'G' to "--.",
        'H' to "....",
        'I' to "..",
        'J' to ".---",
        'K' to "-.-",
        'L' to ".-..",
        'M' to "--",
        'N' to "-.",
        'O' to "---",
        'P' to ".--.",
        'Q' to "--.-",
        'R' to ".-.",
        'S' to "...",
        'T' to "-",
        'U' to "..-",
        'V' to "...-",
        'W' to ".--",
        'X' to "-..-",
        'Y' to "-.--",
        'Z' to "--..",
        '1' to ".----",
        '2' to "..---",
        '3' to "...--",
        '4' to "....-",
        '5' to ".....",
        '6' to "-....",
        '7' to "--...",
        '8' to "---..",
        '9' to "----.",
        '0' to "-----",
        ',' to "--..--",
        '.' to ".-.-.-",
        '?' to "..--..",
        ':' to "---...",
        '-' to "-....-",
        '@' to ".--.-."
    )

    val CODE_TO_CHAR: Map<String, Char> = CHAR_TO_CODE.entries.associate { it.value to it.key }

    fun decode(
        tokens: List<String>,
        unknown: Char = '?'
    ): String =
        buildString {
            for (t in tokens) {
                append(CODE_TO_CHAR[t] ?: unknown)
            }
        }
}

class No29701 {
    fun solve(input: BufferedReader): String {
        input.readLine()
        val tokens = input.readLine()
            .trim()
            .split(Regex("\\s+"))
        return Morse.decode(tokens)
    }
}
