package boj.problems

import java.io.BufferedReader
import kotlin.math.PI
import kotlin.math.pow

class No4573 {
    fun solve(input: BufferedReader): String {
        val output = StringBuilder()
        var menuNumber = 1

        while (true) {
            val n = input.readLine().toInt()
            if (n == 0) break

            var bestDiameter = 0
            var minCostPerInch = Double.MAX_VALUE

            repeat(n) {
                val (d, p) = input.readLine().split(" ").map { it.toDouble() }
                val area = PI * (d / 2).pow(2)
                val costPerInch = p / area

                if (costPerInch < minCostPerInch) {
                    minCostPerInch = costPerInch
                    bestDiameter = d.toInt()
                }
            }

            output.append("Menu $menuNumber: $bestDiameter\n")
            menuNumber++
        }

        return output.toString().trimEnd()
    }
}
