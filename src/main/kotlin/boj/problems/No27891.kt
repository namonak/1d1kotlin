package boj.problems

import java.io.BufferedReader

class No27891 {
    fun solve(input: BufferedReader): String {
        val schools = listOf(
            "NLCS" to "North London Collegiate School",
            "BHA" to "Branksome Hall Asia",
            "KIS" to "Korea International School",
            "SJA" to "St. Johnsbury Academy"
        )

        val encryptedToAbbrev = mutableMapOf<String, String>()

        for ((abbrev, fullName) in schools) {
            val normalized = fullName.filter { it.isLetter() }.lowercase()
            val first10 = if (normalized.length >= 10) normalized.substring(0, 10) else normalized
            for (n in 0..25) {
                val encrypted = shiftForward(first10, n)
                encryptedToAbbrev[encrypted] = abbrev
            }
        }

        val encryptedInput = input.readLine().trim().lowercase()
        return encryptedToAbbrev[encryptedInput] ?: "UNKNOWN"
    }

    private fun shiftForward(
        s: String,
        n: Int
    ): String {
        return s.map {
            val shifted = ((it - 'a') + n) % 26
            'a' + shifted
        }.joinToString("")
    }
}
