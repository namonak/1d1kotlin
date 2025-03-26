package boj.problems

import java.io.BufferedReader
import kotlin.math.max
import kotlin.math.min

class No9298 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        val t = input.readLine().toInt()

        repeat(t) { caseNum ->
            val n = input.readLine().toInt()

            var minX = Double.MAX_VALUE
            var maxX = -Double.MAX_VALUE
            var minY = Double.MAX_VALUE
            var maxY = -Double.MAX_VALUE

            repeat(n) {
                val (xStr, yStr) = input.readLine().split(" ")
                val x = xStr.toDouble()
                val y = yStr.toDouble()

                minX = min(minX, x)
                maxX = max(maxX, x)
                minY = min(minY, y)
                maxY = max(maxY, y)
            }

            val width = maxX - minX
            val height = maxY - minY
            val area = width * height
            val perimeter = 2 * (width + height)

            sb.append("Case ${caseNum + 1}: Area $area, Perimeter $perimeter\n")
        }

        return sb.toString().trimEnd()
    }
}
