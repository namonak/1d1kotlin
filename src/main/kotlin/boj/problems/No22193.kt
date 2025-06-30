package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

class No22193 {
    fun solve(input: BufferedReader): String {
        input.readLine()
        val a = input.readLine()
        val b = input.readLine()

        if (a == "0" || b == "0") return "0"

        val result = BigInteger(a).multiply(BigInteger(b))
        return result.toString()
    }
}
