package boj.problems

import java.io.BufferedReader

class No28249 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var totalSpiciness = 0

        repeat(n) {
            totalSpiciness += when (input.readLine()) {
                "Poblano" -> 1500
                "Mirasol" -> 6000
                "Serrano" -> 15500
                "Cayenne" -> 40000
                "Thai" -> 75000
                "Habanero" -> 125000
                else -> {
                    throw IllegalArgumentException("Unknown chili pepper type")
                }
            }
        }

        return totalSpiciness.toString()
    }
}
