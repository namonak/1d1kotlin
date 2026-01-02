package boj.problems

import java.io.BufferedReader

class No25813 {
    fun solve(input: BufferedReader): String {
        val original = input.readLine()

        val leftUIndex = original.indexOf('U')
        val rightFIndex = original.lastIndexOf('F')

        return buildString {
            original.indices.forEach { index ->
                append(convertChar(index, leftUIndex, rightFIndex))
            }
        }
    }

    private fun convertChar(
        index: Int,
        leftUIndex: Int,
        rightFIndex: Int
    ): Char {
        return when {
            index < leftUIndex -> '-'
            index == leftUIndex -> 'U'
            index < rightFIndex -> 'C'
            index == rightFIndex -> 'F'
            else -> '-'
        }
    }
}
