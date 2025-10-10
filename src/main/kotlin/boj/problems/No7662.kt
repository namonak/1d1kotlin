package boj.problems

import java.io.BufferedReader
import java.util.TreeMap

object No7662 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val results = StringBuilder()

        repeat(testCaseCount) {
            val operationCount = input.readLine().toInt()
            val treeMap = TreeMap<Int, Int>()

            for (i in 0 until operationCount) {
                val (operation, valueStr) = input.readLine().split(" ")
                val value = valueStr.toInt()

                when (operation) {
                    "I" -> treeMap[value] = treeMap.getOrDefault(value, 0) + 1
                    "D" -> {
                        if (treeMap.isEmpty()) continue
                        val key = if (value == 1) treeMap.lastKey() else treeMap.firstKey()
                        if (treeMap[key] == 1) {
                            treeMap.remove(key)
                        } else {
                            treeMap[key] = treeMap[key]!! - 1
                        }
                    }
                }
            }

            if (treeMap.isEmpty()) {
                results.append("EMPTY\n")
            } else {
                results.append("${treeMap.lastKey()} ${treeMap.firstKey()}\n")
            }
        }

        return results.toString().trimEnd()
    }
}
