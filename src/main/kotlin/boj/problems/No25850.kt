package boj.problems

import java.io.BufferedReader

class No25850 {
    private data class Card(
        val number: Int,
        val owner: Char
    )

    fun solve(input: BufferedReader): String {
        val playerCount = input.readLine().toInt()
        val players = generatePlayers(playerCount)

        val cards = readCards(input, players)
        val sortedCards = cards.sortedBy { it.number }

        return sortedCards.joinToString("") { it.owner.toString() }
    }

    private fun generatePlayers(count: Int): CharArray = CharArray(count) { index -> ('A'.code + index).toChar() }

    private fun readCards(
        input: BufferedReader,
        players: CharArray
    ): List<Card> {
        val cardList = mutableListOf<Card>()

        players.forEach { owner ->
            val numbers = input.readLine()
                .trim()
                .split(" ")
                .filter { it.isNotEmpty() }
                .map { it.toInt() }

            numbers.drop(1).forEach { number ->
                cardList.add(Card(number, owner))
            }
        }

        return cardList
    }
}
