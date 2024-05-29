package boj.problems

import java.io.BufferedReader

class No5545 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val (a, b) = input.readLine().split(" ").map { it.toInt() }
        val c = input.readLine().toInt()
        val toppings = (0 until n).map { input.readLine().toInt() }.sortedDescending()

        var maxCaloriesPerCost = c.toDouble() / a

        var currentCalories = c
        var currentCost = a
        for (i in 0 until n) {
            currentCalories += toppings[i]
            currentCost += b
            val caloriesPerCost = currentCalories.toDouble() / currentCost
            if (caloriesPerCost > maxCaloriesPerCost) {
                maxCaloriesPerCost = caloriesPerCost
            }
        }

        return maxCaloriesPerCost.toInt().toString()
    }
}
