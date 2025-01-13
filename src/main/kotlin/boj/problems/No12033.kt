package boj.problems

import java.io.BufferedReader

class No12033 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        for (testCase in 1..t) {
            input.readLine().toInt()
            val prices = input.readLine().split(" ").map { it.toLong() }
            val freqMap = mutableMapOf<Long, Int>()

            for (price in prices) {
                freqMap[price] = freqMap.getOrDefault(price, 0) + 1
            }

            val discountPrices = mutableListOf<Long>()

            fun removeValue(x: Long) {
                val count = freqMap[x] ?: 0
                if (count <= 1) {
                    freqMap.remove(x)
                } else {
                    freqMap[x] = count - 1
                }
            }

            while (freqMap.isNotEmpty()) {
                val current = freqMap.keys.minOrNull()!!
                removeValue(current)
                discountPrices.add(current)

                val originalPrice = current * 4L / 3L
                removeValue(originalPrice)
            }

            result.append("Case #$testCase:")
            for (price in discountPrices) {
                result.append(" $price")
            }
            if (testCase < t) result.append("\n")
        }

        return result.toString()
    }
}
