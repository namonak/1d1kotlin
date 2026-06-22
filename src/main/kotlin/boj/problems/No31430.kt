package boj.problems

import java.io.BufferedReader

class No31430 {
    fun solve(input: BufferedReader): String {
        return when (input.readLine().toInt()) {
            1 -> encodeSum(input.readLine())
            else -> decodeSum(input.readLine())
        }
    }

    private fun encodeSum(input: String): String {
        val sum = input.split(" ").sumOf { it.toLong() }
        return if (sum == SPECIAL_VALUE) SPECIAL_TOKEN else encodeBase26(sum)
    }

    private fun decodeSum(encoded: String): String {
        return if (encoded == SPECIAL_TOKEN) SPECIAL_VALUE.toString() else decodeBase26(encoded).toString()
    }

    private fun encodeBase26(value: Long): String {
        var remaining = value
        return CharArray(ENCODED_LENGTH) {
            val encoded = ((remaining % BASE).toInt() + 'a'.code).toChar()
            remaining /= BASE
            encoded
        }.concatToString()
    }

    private fun decodeBase26(encoded: String): Long {
        return encoded.fold(0L to 1L) { (value, placeValue), char ->
            val decoded = value + (char.code - 'a'.code) * placeValue
            decoded to placeValue * BASE
        }.first
    }

    companion object {
        private const val BASE = 26L
        private const val ENCODED_LENGTH = 13
        private const val SPECIAL_VALUE = 3L
        private const val SPECIAL_TOKEN = "aaaaaaaathree"
    }
}
