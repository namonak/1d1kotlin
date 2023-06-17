package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No7568.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No7568 {
    fun solve(input: BufferedReader): String {
        val count = input.readLine().toInt()
        val people = mutableListOf<Pair<Int, Int>>()
        for (i in 0 until count) {
            val (weight, height) = input.readLine().split(" ").map { it.toInt() }
            people.add(Pair(weight, height))
        }

        val result = mutableListOf<Int>()
        for (i in 0 until count) {
            var rank = 1
            for (j in 0 until count) {
                if (i == j) continue
                if (people[i].first < people[j].first && people[i].second < people[j].second) {
                    rank++
                }
            }
            result.add(rank)
        }

        return result.joinToString(" ")
    }
}
