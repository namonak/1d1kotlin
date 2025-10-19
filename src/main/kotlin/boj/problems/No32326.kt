package boj.problems

import java.io.BufferedReader

class No32326 {
    fun solve(input: BufferedReader): String {
        val redPlates = input.readLine().trim().toInt()
        val greenPlates = input.readLine().trim().toInt()
        val bluePlates = input.readLine().trim().toInt()

        val totalCost = (redPlates * PRICE_RED) +
            (greenPlates * PRICE_GREEN) +
            (bluePlates * PRICE_BLUE)

        return totalCost.toString()
    }

    companion object {
        private const val PRICE_RED = 3
        private const val PRICE_GREEN = 4
        private const val PRICE_BLUE = 5
    }
}
