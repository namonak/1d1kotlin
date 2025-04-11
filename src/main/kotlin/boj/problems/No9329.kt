package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No9329 {
    fun solve(input: BufferedReader): String {
        val output = StringBuilder()
        val t = input.readLine().toInt()

        repeat(t) {
            val (n, _) = input.readLine().split(" ").map { it.toInt() }

            data class Prize(val stickers: List<Int>, val value: Int)

            val prizes = List(n) {
                val tokens = StringTokenizer(input.readLine())
                val k = tokens.nextToken().toInt()
                val required = List(k) { tokens.nextToken().toInt() }
                val value = tokens.nextToken().toInt()
                Prize(required, value)
            }

            val stickerCounts = input.readLine().split(" ").map { it.toInt() }.toMutableList()
            stickerCounts.add(0, 0) // 1-based indexing을 위해 dummy 추가

            var totalPrize = 0

            for (prize in prizes) {
                val count = prize.stickers.minOf { stickerCounts[it] }
                totalPrize += count * prize.value
                // 사용한 만큼 차감
                prize.stickers.forEach { stickerCounts[it] -= count }
            }

            output.appendLine(totalPrize)
        }

        return output.toString().trim()
    }
}
