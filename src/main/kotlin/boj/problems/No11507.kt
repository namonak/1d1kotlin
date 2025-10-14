package boj.problems

import java.io.BufferedReader

class No11507 {
    companion object {
        private const val CARDS_PER_SUIT = 13
        private const val TOKEN_LEN = 3
        private val SUIT_ORDER = charArrayOf('P', 'K', 'H', 'T')

        private fun suitIndex(c: Char): Int? =
            when (c) {
                'P' -> 0
                'K' -> 1
                'H' -> 2
                'T' -> 3
                else -> null
            }
    }

    fun solve(input: BufferedReader): String {
        val s = input.readLine() ?: return "GRESKA"
        if (s.length % TOKEN_LEN != 0) return "GRESKA"

        val seen = Array(SUIT_ORDER.size) { BooleanArray(CARDS_PER_SUIT) }

        for (i in 0 until s.length step TOKEN_LEN) {
            val type = s[i]
            val num = s.substring(i + 1, i + 3).toIntOrNull() ?: return "GRESKA"
            if (num !in 1..CARDS_PER_SUIT) return "GRESKA"

            val si = suitIndex(type) ?: return "GRESKA"
            if (seen[si][num - 1]) return "GRESKA"
            seen[si][num - 1] = true
        }

        return SUIT_ORDER.indices
            .joinToString(" ") { idx -> (CARDS_PER_SUIT - seen[idx].count { it }).toString() }
    }
}
