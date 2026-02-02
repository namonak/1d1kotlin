package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No18706 {
    private data class CoffeeMenu(val small: Int, val medium: Int, val large: Int) {
        fun getPrice(size: String): Int =
            when (size) {
                "small" -> small
                "medium" -> medium
                "large" -> large
                else -> throw IllegalArgumentException("Unknown size: $size")
            }
    }

    private data class Order(val personName: String, val size: String, val coffeeName: String)

    fun solve(input: BufferedReader): String {
        val tokenizer = StringTokenizer(input.readText())
        if (!tokenizer.hasMoreTokens()) return ""

        val sb = StringBuilder()
        val t = tokenizer.nextToken().toInt()

        repeat(t) {
            val c = tokenizer.nextToken().toInt()
            val p = tokenizer.nextToken().toInt()

            val menuMap = mutableMapOf<String, CoffeeMenu>()
            repeat(c) {
                val name = tokenizer.nextToken()
                val sPrice = tokenizer.nextToken().toInt()
                val mPrice = tokenizer.nextToken().toInt()
                val lPrice = tokenizer.nextToken().toInt()
                menuMap[name] = CoffeeMenu(sPrice, mPrice, lPrice)
            }

            val orders = ArrayList<Order>(p)
            repeat(p) {
                val personName = tokenizer.nextToken()
                val size = tokenizer.nextToken()
                val coffeeName = tokenizer.nextToken()
                orders.add(Order(personName, size, coffeeName))
            }

            val deliveryFee = 100 / p

            for (order in orders) {
                val coffeePrice = menuMap[order.coffeeName]?.getPrice(order.size) ?: 0
                val totalCost = coffeePrice + deliveryFee
                val finalCost = applyRoundingRule(totalCost)

                sb.append("${order.personName} $finalCost\n")
            }
        }

        return sb.toString().trimEnd()
    }

    /**
     * 문제의 반올림 규칙 적용
     * 5의 배수에서 1만큼 크거나 작은 경우 1달러를 무시하고 5의 배수로 맞춤
     * - 나머지 1: 1달러 큼 -> -1
     * - 나머지 4: 1달러 작음 -> +1
     */
    private fun applyRoundingRule(cost: Int): Int {
        return when (cost % 5) {
            1 -> cost - 1
            4 -> cost + 1
            else -> cost
        }
    }
}
