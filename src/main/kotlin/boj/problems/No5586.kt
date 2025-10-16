package boj.problems

import java.io.BufferedReader

class No5586 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        val joi = "JOI"
        val ioi = "IOI"
        var joiCount = 0
        var ioiCount = 0

        for (i in 0 until str.length - 2) {
            if (str.substring(i, i + 3) == joi) {
                joiCount++
            } else if (str.substring(i, i + 3) == ioi) {
                ioiCount++
            }
        }

        return "$joiCount\n$ioiCount"
    }
}
