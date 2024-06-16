package boj.problems

import java.io.BufferedReader
import java.io.ByteArrayOutputStream
import java.nio.charset.StandardCharsets

class No10939 {
    private val BASE32_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"

    fun solve(input: BufferedReader): String {
        return decodeToBase32(input.readLine())
    }

    private fun decodeToBase32(input: String): String {
        val output = ByteArrayOutputStream()
        var buffer = 0
        var bitsLeft = 0
        val inputTrimmed = input.trimEnd('=')

        for (char in inputTrimmed) {
            if (char !in BASE32_ALPHABET) {
                throw IllegalArgumentException("Invalid character in Base32 string")
            }

            buffer = (buffer shl 5) or BASE32_ALPHABET.indexOf(char)
            bitsLeft += 5

            if (bitsLeft >= 8) {
                val byte = (buffer shr (bitsLeft - 8)) and 0xFF
                output.write(byte)
                bitsLeft -= 8
            }
        }

        return String(output.toByteArray(), StandardCharsets.UTF_8)
    }
}
