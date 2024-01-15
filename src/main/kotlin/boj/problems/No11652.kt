package boj.problems

import java.io.BufferedReader

object No11652 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val cards = mutableMapOf<Long, Int>()
        repeat(n) {
            val card = input.readLine().toLong()
            cards[card] = cards.getOrDefault(card, 0) + 1
        }
        val maxCount = cards.values.maxOrNull()!!
        val maxCards = cards.filter { it.value == maxCount }.keys
        return maxCards.minOrNull().toString()
    }
}
