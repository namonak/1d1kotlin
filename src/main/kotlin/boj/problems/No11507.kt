package boj.problems

import java.io.BufferedReader

class No11507 {
    fun solve(input: BufferedReader): String {
        val cards = input.readLine()
        val cardSet = mutableMapOf<String, BooleanArray>()
        val cardType = listOf("P", "K", "H", "T")
        cardType.forEach { card ->
            cardSet[card] = BooleanArray(13) { false }
        }

        for (i in cards.indices step 3) {
            val card = cards.substring(i, i + 3)
            val type = card.take(1)
            val number = card.substring(1, 3).toInt()

            if (cardSet[type]!![number - 1]) {
                return "GRESKA"
            } else {
                cardSet[type]!![number - 1] = true
            }
        }

        return cardSet.map { (_, value) -> value.count { !it }.toString() }.joinToString(" ")
    }
}
