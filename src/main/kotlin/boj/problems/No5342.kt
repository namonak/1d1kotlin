package boj.problems

import java.io.BufferedReader

class No5342 {
    fun solve(input: BufferedReader): String {
        val priceMap = mapOf(
            "Paper" to 57.99,
            "Printer" to 120.50,
            "Planners" to 31.25,
            "Binders" to 22.50,
            "Calendar" to 10.95,
            "Notebooks" to 11.20,
            "Ink" to 66.95
        )

        var total = 0.0
        while (true) {
            val line = input.readLine() ?: break
            if (line == "EOI") break
            total += priceMap[line] ?: 0.0
        }

        return "$" + String.format("%.2f", total)
    }
}
