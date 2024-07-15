package boj.problems

import java.io.BufferedReader

class No2153 {
    fun solve(input: BufferedReader): String {
        val word = input.readLine()
        val sum = word.sumOf { if (it.isUpperCase()) it - 'A' + 27 else it - 'a' + 1 }
        return if (isPrime(sum)) "It is a prime word." else "It is not a prime word."
    }

    private fun isPrime(number: Int): Boolean {
        if (number <= 1) return true // 1도 소수로 간주함
        if (number == 2) return true
        if (number % 2 == 0) return false
        for (i in 3..Math.sqrt(number.toDouble()).toInt() step 2) {
            if (number % i == 0) return false
        }
        return true
    }
}
