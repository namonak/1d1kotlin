package boj.problems.step3

import java.io.BufferedReader

class No25314 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine().toInt()
        val result = StringBuilder()

        for (i in 1..number / 4) {
            result.append("long ")
        }
        return result.append("int").toString()
    }
}
