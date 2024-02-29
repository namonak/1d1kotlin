package boj.problems

import java.io.BufferedReader

object No30700 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        val korea = "KOREA"
        var count = 0
        var index = 0
        for (i in str.indices) {
            if (str[i] == korea[index]) {
                index++
                count++
            }
            if (index == korea.length) {
                index = 0
            }
        }
        return count.toString()
    }
}
