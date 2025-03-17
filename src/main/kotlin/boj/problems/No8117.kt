package boj.problems

import java.io.BufferedReader

class No8117 {
    fun solve(input: BufferedReader): String {
        val lengths = mutableListOf<Int>()

        while (true) {
            val value = input.readLine().toInt()
            if (value == 0) break
            lengths.add(value)
        }

        if (lengths.size < 3) {
            return "NIE"
        }

        lengths.sort()

        for (i in 0 until lengths.size - 2) {
            val a = lengths[i]
            val b = lengths[i + 1]
            val c = lengths[i + 2]

            if (a + b > c) {
                return "$a $b $c"
            }
        }

        return "NIE"
    }
}
