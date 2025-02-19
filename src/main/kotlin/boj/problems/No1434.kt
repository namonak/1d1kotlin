package boj.problems

import java.io.BufferedReader

class No1434 {
    fun solve(reader: BufferedReader): String {
        val (n, _) = reader.readLine().split(" ").map { it.toInt() }
        val boxes = reader.readLine().split(" ").map { it.toInt() }
        val books = reader.readLine().split(" ").map { it.toInt() }
        var boxIndex = 0
        var used = 0
        var waste = 0

        for (book in books) {
            while (used + book > boxes[boxIndex]) {
                waste += boxes[boxIndex] - used
                boxIndex++
                used = 0
            }
            used += book
        }

        waste += boxes[boxIndex] - used
        for (i in boxIndex + 1 until n) {
            waste += boxes[i]
        }

        return waste.toString()
    }
}
