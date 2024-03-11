package boj.problems

import java.io.BufferedReader
import java.util.PriorityQueue

class No1417 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var dasom = input.readLine().toInt()
        val others = PriorityQueue<Int>(reverseOrder())
        var result = 0

        repeat(n - 1) {
            others.add(input.readLine().toInt())
        }

        if (others.isEmpty()) {
            return "0"
        }

        while (dasom <= others.peek()) {
            val max = others.poll()
            others.add(max - 1)
            dasom++
            result++
        }

        return result.toString()
    }
}
