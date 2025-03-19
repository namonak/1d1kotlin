package boj.problems

import java.io.BufferedReader
import java.math.RoundingMode
import java.text.DecimalFormat

class No1894 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val line = input.readLine() ?: break
            if (line.isEmpty()) continue

            val tokens = line.split(" ").map { it.toDouble() }

            val points = List(4) { Point(tokens[it * 2], tokens[it * 2 + 1]) }

            val duplicatePoint = points.groupBy { it }
                .filter { it.value.size == 2 }
                .keys
                .first()

            val otherPoints = points.filter { it != duplicatePoint }

            val a = otherPoints[0]
            val c = otherPoints[1]

            val dx = a.x + c.x - duplicatePoint.x
            val dy = a.y + c.y - duplicatePoint.y

            val formattedX = formatDecimal(dx)
            val formattedY = formatDecimal(dy)

            result.append("$formattedX $formattedY\n")
        }

        return result.toString().trimEnd()
    }

    private fun formatDecimal(value: Double): String {
        val df = DecimalFormat("0.000")
        df.roundingMode = RoundingMode.HALF_UP
        return df.format(value)
    }

    data class Point(val x: Double, val y: Double)
}
