package boj.problems.step3

import java.io.BufferedReader

object No1110 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var newNumber = n
        var count = 0
        do {
            newNumber = newNumber % 10 * 10 + (newNumber / 10 + newNumber % 10) % 10
            count++
        } while (newNumber != n)
        return count.toString()
    }
}
