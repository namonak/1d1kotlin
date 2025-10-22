package boj.problems

import java.io.BufferedReader

class No11720 {
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
