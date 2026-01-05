package boj.problems

import java.io.BufferedReader
import kotlin.math.PI

class No34922 {
    fun solve(input: BufferedReader): String {
        val (w, h) = input.readLine()?.split(" ")?.map { it.toDouble() } ?: return ""
        val r = input.readLine()?.toDouble() ?: return ""

        val totalArea = w * h
        val teacherRangeArea = (PI * r * r) / 4.0
        val blindSpotArea = totalArea - teacherRangeArea

        return "%.6f".format(blindSpotArea)
    }
}
