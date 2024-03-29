package boj.problems.step6

import java.io.BufferedReader

object No11720 {
    fun solve(input: BufferedReader): String {
        val strLen = input.readLine().toInt()
        val inputStr = input.readLine()
        var result = 0
        for (i in 0 until strLen) {
            result += inputStr[i].toString().toInt()
        }
        return result.toString().trimEnd()
    }
}
