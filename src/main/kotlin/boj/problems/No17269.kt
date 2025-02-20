package boj.problems

import java.io.BufferedReader

class No17269 {
    fun solve(input: BufferedReader): String {
        val strokes = mapOf(
            'A' to 3, 'B' to 2, 'C' to 1, 'D' to 2, 'E' to 4,
            'F' to 3, 'G' to 1, 'H' to 3, 'I' to 1, 'J' to 1,
            'K' to 3, 'L' to 1, 'M' to 3, 'N' to 2, 'O' to 1,
            'P' to 2, 'Q' to 2, 'R' to 2, 'S' to 1, 'T' to 2,
            'U' to 1, 'V' to 1, 'W' to 1, 'X' to 2, 'Y' to 2, 'Z' to 1
        )

        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val (nameA, nameB) = input.readLine().split(" ")

        val merged = StringBuilder()
        val length = maxOf(n, m)
        for (i in 0 until length) {
            if (i < n) merged.append(nameA[i])
            if (i < m) merged.append(nameB[i])
        }

        val numbers = merged.map { strokes.getValue(it) }.toMutableList()

        while (numbers.size > 2) {
            val temp = mutableListOf<Int>()
            for (i in 0 until numbers.size - 1) {
                temp.add((numbers[i] + numbers[i + 1]) % 10)
            }
            numbers.clear()
            numbers.addAll(temp)
        }

        return if (numbers[0] == 0) "${numbers[1]}%" else "${numbers[0]}${numbers[1]}%"
    }
}
