package boj.problems

import java.io.BufferedReader

class No15814 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()
        val n = input.readLine().toInt()
        val charArray = s.toCharArray()

        repeat(n) {
            val (a, b) = input.readLine()!!.split(" ").map { it.toInt() }
            val temp = charArray[a]
            charArray[a] = charArray[b]
            charArray[b] = temp
        }

        return String(charArray)
    }
}
