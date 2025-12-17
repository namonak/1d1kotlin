package boj.problems

import java.io.BufferedReader

class No28455 {
    fun solve(input: BufferedReader): String {
        val characterCount = input.readLine().toInt()
        val levels = readLevels(input, characterCount)

        val unionMembers = selectUnionMembers(levels)
        val totalLevelSum = unionMembers.sum()
        val totalStatBonus = unionMembers.sumOf { calculateStatBonus(it) }

        return "$totalLevelSum $totalStatBonus"
    }

    private fun readLevels(
        input: BufferedReader,
        count: Int
    ): List<Int> = List(count) { input.readLine().toInt() }

    private fun selectUnionMembers(levels: List<Int>): List<Int> = levels.sortedDescending().take(MAX_UNION_SIZE)

    private fun calculateStatBonus(level: Int): Int = STAT_BONUS_LEVELS.count { level >= it }

    companion object {
        private const val MAX_UNION_SIZE = 42
        private val STAT_BONUS_LEVELS = listOf(60, 100, 140, 200, 250)
    }
}
