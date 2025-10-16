package boj.problems

import java.io.BufferedReader

private const val STATION_COUNT = 4

class No2455 {
    fun solve(input: BufferedReader): String {
        val passengerCounts = IntArray(STATION_COUNT)

        for (i in 0 until STATION_COUNT) {
            val (alightedPassengers, boardedPassengers) = input.readLine().split(" ").map { it.toInt() }
            if (i == 0 || i == STATION_COUNT - 1) {
                passengerCounts[i] = boardedPassengers - alightedPassengers
            } else {
                passengerCounts[i] = passengerCounts[i - 1] + boardedPassengers - alightedPassengers
            }
        }

        return passengerCounts.maxOrNull().toString()
    }
}
