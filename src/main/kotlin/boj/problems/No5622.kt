package boj.problems

import java.io.BufferedReader

class No5622 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        var sum = 0

        str.forEach {
            sum += when (it) {
                'A', 'B', 'C' -> 3
                'D', 'E', 'F' -> 4
                'G', 'H', 'I' -> 5
                'J', 'K', 'L' -> 6
                'M', 'N', 'O' -> 7
                'P', 'Q', 'R', 'S' -> 8
                'T', 'U', 'V' -> 9
                'W', 'X', 'Y', 'Z' -> 10
                else -> 0
            }
        }

        return sum.toString()
    }
}
