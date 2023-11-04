package boj.problems

import java.io.BufferedReader

object No1373 {
    fun solve(input: BufferedReader): String {
        val binary = input.readLine()
        return binary.toBigInteger(2).toString(8)
    }
}
