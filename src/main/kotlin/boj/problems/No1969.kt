package boj.problems

import java.io.BufferedReader

class No1969 {
    fun solve(input: BufferedReader): String {
        val (n, _) = input.readLine().split(" ").map { it.toInt() }
        val dna = Array(n) { input.readLine() }
        val result = StringBuilder()
        var hammingDistance = 0

        for (i in dna[0].indices) {
            val count = IntArray(4)
            for (j in dna.indices) {
                when (dna[j][i]) {
                    'A' -> count[0]++
                    'C' -> count[1]++
                    'G' -> count[2]++
                    'T' -> count[3]++
                }
            }
            val max = count.maxOrNull()!!
            hammingDistance += n - max
            result.append(
                when (count.indexOf(max)) {
                    0 -> 'A'
                    1 -> 'C'
                    2 -> 'G'
                    3 -> 'T'
                    else -> throw IllegalStateException()
                }
            )
        }

        return buildString {
            append(result)
            append('\n')
            append(hammingDistance)
        }
    }
}
