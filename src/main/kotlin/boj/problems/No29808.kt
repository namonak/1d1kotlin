package boj.problems

import java.io.BufferedReader

class No29808 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine().toInt()
        if (s % SCORE_UNIT != 0) return "0"

        return formatAnswers(findAnswers(s / SCORE_UNIT))
    }

    private fun findAnswers(target: Int): List<Pair<Int, Int>> {
        val answers = mutableListOf<Pair<Int, Int>>()

        for (d1 in 0..MAX_DETAIL_SCORE) {
            for (d2 in 0..MAX_DETAIL_SCORE) {
                if (canMakeTarget(target, d1, d2)) {
                    answers.add(d1 to d2)
                }
            }
        }

        return answers
    }

    private fun canMakeTarget(
        target: Int,
        d1: Int,
        d2: Int
    ): Boolean {
        for (m1 in firstMultipliers(d1)) {
            for (m2 in secondMultipliers(d2)) {
                if (d1 * m1 + d2 * m2 == target) return true
            }
        }

        return false
    }

    private fun firstMultipliers(d1: Int): List<Int> {
        return if (d1 == 0) listOf(108) else listOf(508, 108)
    }

    private fun secondMultipliers(d2: Int): List<Int> {
        return if (d2 == 0) listOf(305) else listOf(212, 305)
    }

    private fun formatAnswers(answers: List<Pair<Int, Int>>): String {
        return buildString {
            append(answers.size).append('\n')
            answers.forEach { (a, b) -> append(a).append(' ').append(b).append('\n') }
        }.trimEnd()
    }

    private companion object {
        const val SCORE_UNIT = 4763
        const val MAX_DETAIL_SCORE = 200
    }
}
