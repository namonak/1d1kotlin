package boj.problems

import java.io.BufferedReader

class No5543 {
    fun solve(input: BufferedReader): String {
        val burgerPrices = (0..2).map { input.readLine().toInt() }
        val beveragePrices = (0..1).map { input.readLine().toInt() }
        return (burgerPrices.minOrNull()!! + beveragePrices.minOrNull()!! - 50).toString()
    }
}
