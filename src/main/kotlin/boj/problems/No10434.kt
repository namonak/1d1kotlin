package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.sqrt

class No10434 {
    companion object {
        private const val MAX_NUM = 10000
        private const val HAPPY_TARGET = 1
        private const val RESULT_YES = "YES"
        private const val RESULT_NO = "NO"

        private val isPrimeArray: BooleanArray by lazy {
            createSieve(MAX_NUM)
        }

        private fun createSieve(limit: Int): BooleanArray {
            val sieve = BooleanArray(limit + 1) { true }
            sieve[0] = false
            sieve[1] = false

            for (i in 2..sqrt(limit.toDouble()).toInt()) {
                if (sieve[i]) {
                    for (j in i * i..limit step i) {
                        sieve[j] = false
                    }
                }
            }
            return sieve
        }
    }

    fun solve(input: BufferedReader): String {
        val numberOfDataSets = input.readLine().toInt()
        val resultBuilder = StringBuilder()

        repeat(numberOfDataSets) {
            val tokenizer = StringTokenizer(input.readLine())
            val dataSetId = tokenizer.nextToken().toInt()
            val numberToCheck = tokenizer.nextToken().toInt()
            val isHappyPrime = isPrime(numberToCheck) && isHappy(numberToCheck)

            appendResult(resultBuilder, dataSetId, numberToCheck, isHappyPrime)
        }

        return resultBuilder.toString().trimEnd()
    }

    private fun isPrime(number: Int): Boolean {
        if (number > MAX_NUM) return false
        return isPrimeArray[number]
    }

    private fun isHappy(number: Int): Boolean {
        var currentNumber = number
        val visitedHistory = mutableSetOf<Int>()

        // 1이 되거나, 이미 방문했던 숫자(사이클)가 나올 때까지 반복
        while (currentNumber != HAPPY_TARGET && !visitedHistory.contains(currentNumber)) {
            visitedHistory.add(currentNumber)
            currentNumber = calculateSumOfSquaredDigits(currentNumber)
        }

        return currentNumber == HAPPY_TARGET
    }

    private fun calculateSumOfSquaredDigits(number: Int): Int {
        var temp = number
        var sum = 0
        while (temp > 0) {
            val digit = temp % 10
            sum += (digit * digit)
            temp /= 10
        }
        return sum
    }

    private fun appendResult(
        sb: StringBuilder,
        id: Int,
        m: Int,
        isHappyPrime: Boolean
    ) {
        val resultStr = if (isHappyPrime) RESULT_YES else RESULT_NO
        sb.append("$id $m $resultStr\n")
    }
}
