package boj.problems

import java.io.BufferedReader

object No2910 {
    fun solve(input: BufferedReader): String {
        val (_, _) = input.readLine().split(" ").map { it.toInt() }
        val numbers = input.readLine().split(" ").map { it.toInt() }
        val frequencyMap = mutableMapOf<Int, Int>()
        val result = mutableListOf<Int>()

        numbers.forEach {
            frequencyMap[it] = frequencyMap.getOrDefault(it, 0) + 1
        }

        frequencyMap.toList().sortedByDescending { it.second }.forEach { (number, count) ->
            repeat(count) {
                result.add(number)
            }
        }

        return result.joinToString(" ")
    }
}
