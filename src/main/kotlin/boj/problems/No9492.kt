package boj.problems

import java.io.BufferedReader

class No9492 {
    fun solve(input: BufferedReader): String =
        buildString {
            while (true) {
                val line = input.readLine() ?: break
                val n = line.trim().toInt()

                if (n == 0) break

                val deck = ArrayList<String>(n)
                repeat(n) {
                    deck.add(input.readLine())
                }

                shuffleAndAppend(n, deck, this)
            }
        }.trimEnd()

    private fun shuffleAndAppend(
        n: Int,
        deck: List<String>,
        output: StringBuilder
    ) {
        val midIndex = (n + 1) / 2

        for (i in 0 until midIndex) {
            output.append(deck[i]).append('\n')

            val bottomIndex = i + midIndex
            if (bottomIndex < n) {
                output.append(deck[bottomIndex]).append('\n')
            }
        }
    }
}
