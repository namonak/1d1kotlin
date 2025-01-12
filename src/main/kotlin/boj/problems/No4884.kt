package boj.problems

import java.io.BufferedReader

class No4884 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()

        while (true) {
            val line = input.readLine() ?: break
            if (line.isBlank()) continue

            val (g, t, a, d) = line.split(" ").map { it.toLong() }
            if (g == -1L && t == -1L && a == -1L && d == -1L) {
                break
            }

            val groupMatches = g * (t * (t - 1) / 2)
            val n = g * a + d
            val finalN = nextPowerOfTwo(n)
            val additionalTeams = finalN - n
            val knockoutMatches = finalN - 1
            val totalMatches = groupMatches + knockoutMatches

            sb.append("$g*$a/$t+$d$totalMatches+$additionalTeams\n")
        }

        return sb.toString().trimEnd()
    }

    private fun nextPowerOfTwo(n: Long): Long {
        if (n < 1L) return 1L
        if ((n and (n - 1L)) == 0L) {
            return n
        }
        var x = n - 1
        x = x or (x shr 1)
        x = x or (x shr 2)
        x = x or (x shr 4)
        x = x or (x shr 8)
        x = x or (x shr 16)
        x = x or (x shr 32)
        return x + 1
    }
}
