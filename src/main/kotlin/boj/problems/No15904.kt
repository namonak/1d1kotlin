package boj.problems

import java.io.BufferedReader

class No15904 {
    fun solve(input: BufferedReader): String {
        val inputString = input.readLine()
        val ucpc = "UCPC"
        var ucpcIndex = 0

        for (i in inputString.indices) {
            if (inputString[i] == ucpc[ucpcIndex]) {
                ucpcIndex++
            }

            if (ucpcIndex == ucpc.length) {
                return "I love UCPC"
            }
        }

        return "I hate UCPC"
    }
}
