package boj.problems

import java.io.BufferedReader

object No1212 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        input.readLine().forEach {
            val num = it.toString().toInt()
            sb.append(num.toString(2).padStart(3, '0'))
        }

        val resultString = sb.toString()
        return if (resultString.length == 3 && resultString.toInt() == 0) {
            "0"
        } else {
            resultString.trimStart('0')
        }
    }
}
