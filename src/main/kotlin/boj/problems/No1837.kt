package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

class No1837 {
    fun solve(input: BufferedReader): String {
        val (p, k) = input.readLine().split(" ").map { it.toBigInteger() }
        var i = BigInteger("1")

        while (true) {
            if (i.compareTo(k) == 1 || i.compareTo(k) == 0) {
                return "GOOD"
            }
            i = i.add(BigInteger.ONE)

            if (p.remainder(i).compareTo(BigInteger.ZERO) == 0 && i.compareTo(k) == -1) {
                return "BAD $i"
            }
        }
    }
}
