package boj.problems

import java.io.BufferedReader
import java.util.TreeMap

class No7662 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val results = StringBuilder()

        repeat(testCaseCount) {
            val operationCount = input.readLine().toInt()
            val result = processSingleTestCase(operationCount, input)
            results.append(result).append("\n")
        }

        return results.toString().trimEnd()
    }

    private fun processSingleTestCase(
        operationCount: Int,
        input: BufferedReader
    ): String {
        val dualPriorityQueue = TreeMap<Int, Int>()

        repeat(operationCount) {
            val (operation, value) = input.readLine().split(" ")
            handleOperation(dualPriorityQueue, operation, value.toInt())
        }

        return formatResult(dualPriorityQueue)
    }

    private fun handleOperation(
        map: TreeMap<Int, Int>,
        operation: String,
        value: Int
    ) {
        when (operation) {
            "I" -> performInsertion(map, value)
            "D" -> performDeletion(map, value)
        }
    }

    private fun performInsertion(
        map: TreeMap<Int, Int>,
        value: Int
    ) {
        map[value] = map.getOrDefault(value, 0) + 1
    }

    private fun performDeletion(
        map: TreeMap<Int, Int>,
        type: Int
    ) {
        if (map.isEmpty()) {
            return
        }

        val keyToRemove = if (type == 1) map.lastKey() else map.firstKey()
        val count = map.getValue(keyToRemove)

        if (count == 1) {
            map.remove(keyToRemove)
        } else {
            map[keyToRemove] = count - 1
        }
    }

    private fun formatResult(map: TreeMap<Int, Int>): String {
        return if (map.isEmpty()) {
            "EMPTY"
        } else {
            "${map.lastKey()} ${map.firstKey()}"
        }
    }
}
