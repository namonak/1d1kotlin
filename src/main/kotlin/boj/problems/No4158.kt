package boj.problems

import java.io.BufferedReader

class No4158 {
    fun solve(input: BufferedReader): String {
        val results = mutableListOf<Int>()

        generateSequence {
            val (n, m) = input.readLine().split(" ").map { it.toInt() }
            if (n == 0 && m == 0) null else n to m
        }.forEach { (n, m) ->
            val sanggeunCDs = readCDs(input, n)
            val seonyeongCDs = readCDs(input, m)
            results.add(countCommonCDs(sanggeunCDs, seonyeongCDs))
        }

        return results.joinToString("\n")
    }

    private fun readCDs(
        input: BufferedReader,
        count: Int
    ): List<Long> {
        return List(count) { input.readLine().toLong() }
    }

    private fun countCommonCDs(
        list1: List<Long>,
        list2: List<Long>
    ): Int {
        var count = 0
        var i = 0
        var j = 0

        while (i < list1.size && j < list2.size) {
            when {
                list1[i] == list2[j] -> {
                    count++
                    i++
                    j++
                }
                list1[i] < list2[j] -> i++
                else -> j++
            }
        }

        return count
    }
}
