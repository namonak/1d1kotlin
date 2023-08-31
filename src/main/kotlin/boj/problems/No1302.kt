package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1302.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No1302 {
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
