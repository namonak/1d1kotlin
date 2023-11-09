package boj.problems

import java.io.BufferedReader

object No1235 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val studentNumbers = mutableListOf<String>()

        repeat(n) {
            studentNumbers.add(input.readLine())
        }

        var k = 1
        while (true) {
            val uniqueNumbers = mutableSetOf<String>()

            for (studentNumber in studentNumbers) {
                val trimmedNumber = studentNumber.substring(studentNumber.length - k)
                uniqueNumbers.add(trimmedNumber)
            }

            if (uniqueNumbers.size == n) {
                return k.toString()
            }

            k++
        }
    }
}
