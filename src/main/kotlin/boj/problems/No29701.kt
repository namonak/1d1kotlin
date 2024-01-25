package boj.problems

import java.io.BufferedReader

object No29701 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val morse = input.readLine().split(" ")
        val morseCodeMap: Map<Char, String> = mapOf(
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

        return morse.joinToString("") { morseCodeMap.entries.find { entry -> entry.value == it }!!.key.toString() }
    }
}
