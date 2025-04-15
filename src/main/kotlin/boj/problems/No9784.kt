package boj.problems

import java.io.BufferedReader

class No9784 {
    fun solve(input: BufferedReader): String {
        val testCases = input.readLine().toInt()
        val result = StringBuilder()

        repeat(testCases) { caseNum ->
            val (_, p, q) = input.readLine().split(" ").map { it.toInt() }
            val eggWeights = input.readLine().split(" ").map { it.toInt() }.sorted()

            var totalWeight = 0
            var eggsBoiled = 0

            for (weight in eggWeights) {
                if (eggsBoiled + 1 > p || totalWeight + weight > q) {
                    break
                }
                totalWeight += weight
                eggsBoiled++
            }

            result.appendLine("Case ${caseNum + 1}: $eggsBoiled")
        }

        return result.toString().trim()
    }
}
