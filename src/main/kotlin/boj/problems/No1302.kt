package boj.problems

import java.io.BufferedReader

class No1302 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val books = HashMap<String, Int>()

        repeat(n) {
            val book = input.readLine()
            books[book] = books.getOrDefault(book, 0) + 1
        }

        val maxBooks = books.maxByOrNull { it.value }!!.value
        val bestSeller = books.filter { it.value == maxBooks }.keys.sorted()

        return bestSeller.first()
    }
}
