package boj.problems

import java.io.BufferedReader
import kotlin.math.roundToInt

class No9493 {
    fun solve(input: BufferedReader): String {
        val resultAccumulator = StringBuilder()

        while (true) {
            val (distance, trainSpeed, planeSpeed) = input.readLine().split(" ").map { it.toInt() }

            if (isTerminationCondition(distance, trainSpeed, planeSpeed)) {
                break
            }

            val diffSeconds = calculateTimeDifferenceInSeconds(distance, trainSpeed, planeSpeed)
            val formattedTime = formatSecondsToHMS(diffSeconds)

            resultAccumulator.appendLine(formattedTime)
        }

        // 마지막 줄바꿈 제거 후 반환
        return resultAccumulator.toString().trimEnd()
    }

    private fun isTerminationCondition(
        distance: Int,
        trainSpeed: Int,
        planeSpeed: Int
    ): Boolean {
        return distance == END_OF_INPUT && trainSpeed == END_OF_INPUT && planeSpeed == END_OF_INPUT
    }

    private fun calculateTimeDifferenceInSeconds(
        distance: Int,
        trainSpeed: Int,
        planeSpeed: Int
    ): Int {
        val trainTimeHours = distance.toDouble() / trainSpeed
        val planeTimeHours = distance.toDouble() / planeSpeed
        val diffSeconds = (trainTimeHours - planeTimeHours) * SECONDS_PER_HOUR

        return diffSeconds.roundToInt()
    }

    private fun formatSecondsToHMS(totalSeconds: Int): String {
        val hours = totalSeconds / SECONDS_PER_HOUR
        val remainingSeconds = totalSeconds % SECONDS_PER_HOUR
        val minutes = remainingSeconds / SECONDS_PER_MINUTE
        val seconds = remainingSeconds % SECONDS_PER_MINUTE

        return "%d:%02d:%02d".format(hours, minutes, seconds)
    }

    companion object {
        private const val SECONDS_PER_HOUR = 3600
        private const val SECONDS_PER_MINUTE = 60
        private const val END_OF_INPUT = 0
    }
}
