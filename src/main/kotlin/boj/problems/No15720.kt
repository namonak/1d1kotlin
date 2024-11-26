package boj.problems

import java.io.BufferedReader

class No15720 {
    fun solve(input: BufferedReader): String {
        val (burgerCount, sideCount, drinkCount) = input.readLine().split(" ").map { it.toInt() }
        val setCount = minOf(burgerCount, sideCount, drinkCount)
        val burgers = input.readLine().split(" ").map { it.toInt() }.sortedDescending()
        val sides = input.readLine().split(" ").map { it.toInt() }.sortedDescending()
        val drinks = input.readLine().split(" ").map { it.toInt() }.sortedDescending()
        val totalPrice = burgers.sum() + sides.sum() + drinks.sum()
        val discountPrice = calculateDiscountPrice(burgers, sides, drinks, setCount)

        return "$totalPrice\n$discountPrice"
    }

    private fun calculateDiscountPrice(burgers: List<Int>, sides: List<Int>, drinks: List<Int>, setCount: Int): Int {
        val discount = (0 until setCount).sumOf { index ->
            (burgers[index] + sides[index] + drinks[index]) * 0.9
        }.toInt()
        return discount + (burgers.drop(setCount).sum() + sides.drop(setCount).sum() + drinks.drop(setCount).sum())
    }
}
