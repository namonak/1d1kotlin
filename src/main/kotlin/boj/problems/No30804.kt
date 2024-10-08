package boj.problems

import java.io.BufferedReader
import kotlin.math.max

class No30804 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val fruits = input.readLine().split(" ").map { it.toInt() }
        val fruitsCount = mutableMapOf<Int, Int>()
        var left = 0
        var maxCount = 0

        for (right in 0 until n) {
            val fruit = fruits[right]
            fruitsCount[fruit] = fruitsCount.getOrDefault(fruit, 0) + 1

            while (fruitsCount.size > 2) {
                val leftFruit = fruits[left]
                fruitsCount[leftFruit].let {
                    if (it == 1) {
                        fruitsCount.remove(leftFruit)
                    } else {
                        fruitsCount[leftFruit] = it!! - 1
                    }
                }
                if (fruitsCount[leftFruit] == 0) {
                    fruitsCount.remove(leftFruit)
                }
                left++
            }

            maxCount = max(maxCount, right - left + 1)
        }

        return maxCount.toString()
    }
}
