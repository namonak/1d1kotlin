package boj.problems

import java.io.BufferedReader

class No28702 {
    fun solve(input: BufferedReader): String {
        val regex = """-?\d+""".toRegex()

        for (i in 3 downTo 1) {
            val str = input.readLine()
            if (regex.matches(str)) {
                val num = str.toInt() + i
                return when {
                    num % 15 == 0 -> "FizzBuzz"
                    num % 3 == 0 -> "Fizz"
                    num % 5 == 0 -> "Buzz"
                    else -> num.toString()
                }
            }
        }

        return ""
    }
}
