package boj.problems

import java.io.BufferedReader

class No32778 {
    fun solve(input: BufferedReader): String {
        val line = input.readLine().trim()
        val openIndex = line.indexOf('(')
        val closeIndex = line.indexOf(')')

        if (openIndex == -1 || closeIndex == -1 || openIndex > closeIndex) {
            val subStationName = "-"
            return "$line\n$subStationName"
        }

        val stationName = line.substring(0, openIndex).trim()
        val subStationName = line.substring(openIndex + 1, closeIndex).trim()

        return "$stationName\n$subStationName"
    }
}
