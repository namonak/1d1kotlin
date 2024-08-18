package boj.problems

import java.io.BufferedReader

class No5949 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine().toInt()
        return number.toString().reversed().chunked(3).joinToString(",").reversed()
    }
}
