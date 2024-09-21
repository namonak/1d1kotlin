package boj.problems

import java.io.BufferedReader

class No30802 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sizes = input.readLine().split(" ").map { it.toInt() }
        val (t, p) = input.readLine().split(" ").map { it.toInt() }

        val shirtBundles = sizes.sumOf { (it + t - 1) / t }
        val penBundles = n / p
        val remainingPens = n % p

        return "$shirtBundles\n$penBundles $remainingPens"
    }
}
