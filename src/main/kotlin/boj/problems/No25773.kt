package boj.problems

import java.io.BufferedReader

class No25773 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine().trim()
        val sortedNumber = number.toCharArray().sortedDescending().joinToString("")
        return sortedNumber
    }
}
