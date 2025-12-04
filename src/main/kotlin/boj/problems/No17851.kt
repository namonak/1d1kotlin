package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No17851 {
    fun solve(input: BufferedReader): String {
        val stateUTeam = readHeights(input)
        val uStateTeam = readHeights(input)

        stateUTeam.sort()
        uStateTeam.sort()

        var tallerCount = 0
        for (index in 0 until PLAYER_COUNT) {
            if (stateUTeam[index] > uStateTeam[index]) {
                tallerCount++
            }
        }

        return tallerCount.toString()
    }

    private fun readHeights(input: BufferedReader): IntArray {
        val tokenizer = StringTokenizer(input.readLine())
        val heights = IntArray(PLAYER_COUNT)

        for (index in 0 until PLAYER_COUNT) {
            heights[index] = tokenizer.nextToken().toInt()
        }

        return heights
    }

    companion object {
        private const val PLAYER_COUNT = 5
    }
}
