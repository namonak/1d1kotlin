package boj.problems

import java.io.BufferedReader

class No10940 {
    fun solve(input: BufferedReader): String {
        val given = input.readLine()
        return given.toByteArray().joinToString("") { "%02X".format(it) }
    }
}
