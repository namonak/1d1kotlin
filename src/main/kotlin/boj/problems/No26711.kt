package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

class No26711 {
    fun solve(input: BufferedReader): String {
        val a = BigInteger(input.readLine())
        val b = BigInteger(input.readLine())
        return a.add(b).toString()
    }
}
