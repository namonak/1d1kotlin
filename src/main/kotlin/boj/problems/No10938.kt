package boj.problems

import java.io.BufferedReader

class No10938 {
    private val BASE32_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"

    fun solve(input: BufferedReader): String {
        return encodeToBase32(input.readLine())
    }

    private fun encodeToBase32(input: String): String {
        val inputBytes = input.toByteArray()
        val output = StringBuilder()
        var buffer = 0
        var bitsLeft = 0

        for (byte in inputBytes) {
            buffer = (buffer shl 8) or (byte.toInt() and 0xFF)
            bitsLeft += 8
            while (bitsLeft >= 5) {
                val index = (buffer shr (bitsLeft - 5)) and 0x1F
                output.append(BASE32_ALPHABET[index])
                bitsLeft -= 5
            }
        }

        if (bitsLeft > 0) {
            val index = (buffer shl (5 - bitsLeft)) and 0x1F
            output.append(BASE32_ALPHABET[index])
        }

        while (output.length % 8 != 0) {
            output.append('=')
        }

        return output.toString()
    }

}
