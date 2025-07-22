package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

class No13706 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().let { BigInteger(it) }
        var low = BigInteger.ONE
        var high = n
        val two = BigInteger.valueOf(2)

        while (low <= high) {
            val mid = (low + high).divide(two)
            val square = mid * mid

            when {
                square == n ->
                    return mid.toString()
                square < n ->
                    low = mid + BigInteger.ONE
                else ->
                    high = mid - BigInteger.ONE
            }
        }

        return high.toString()
    }
}
