package boj.problems

import java.io.BufferedReader

class No5430 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()

        return List(t) {
            val operations = input.readLine()
            val size = input.readLine().toInt()
            val numbers = parseNumbers(input.readLine(), size)

            executeOperations(operations, numbers)
        }.joinToString("\n")
    }

    private fun parseNumbers(
        input: String,
        size: Int
    ): ArrayDeque<Int> {
        if (size == 0) return ArrayDeque()

        return input
            .drop(1)
            .dropLast(1)
            .split(",")
            .map { it.toInt() }
            .toCollection(ArrayDeque())
    }

    private fun executeOperations(
        operations: String,
        numbers: ArrayDeque<Int>
    ): String {
        var isReversed = false

        for (operation in operations) {
            when (operation) {
                'R' -> isReversed = !isReversed
                'D' -> if (!dropNumber(numbers, isReversed)) return "error"
            }
        }

        return formatNumbers(numbers, isReversed)
    }

    private fun dropNumber(
        numbers: ArrayDeque<Int>,
        isReversed: Boolean
    ): Boolean {
        if (numbers.isEmpty()) return false

        if (isReversed) {
            numbers.removeLast()
        } else {
            numbers.removeFirst()
        }
        return true
    }

    private fun formatNumbers(
        numbers: ArrayDeque<Int>,
        isReversed: Boolean
    ): String {
        if (isReversed) numbers.reverse()

        return numbers.joinToString(",", "[", "]")
    }
}
