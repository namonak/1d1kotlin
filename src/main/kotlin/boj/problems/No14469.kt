package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No14469 {
    private data class Cow(
        val arrivalTime: Int,
        val checkTime: Int
    )

    fun solve(input: BufferedReader): String {
        val n = input.readLine()?.toInt() ?: return "0"

        val cows = List(n) {
            val st = StringTokenizer(input.readLine())
            Cow(
                arrivalTime = st.nextToken().toInt(),
                checkTime = st.nextToken().toInt()
            )
        }

        val sortedCows = cows.sortedBy { it.arrivalTime }

        val totalTime = calculateTotalTime(sortedCows)

        return totalTime.toString()
    }

    private fun calculateTotalTime(sortedCows: List<Cow>): Int {
        return sortedCows.fold(0) { currentTime, cow ->
            val startTime = maxOf(currentTime, cow.arrivalTime)
            startTime + cow.checkTime
        }
    }
}
