package boj.problems

import java.io.BufferedReader
import kotlin.math.max

class No2670 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val arr = DoubleArray(n) { input.readLine().toDouble() }

        var maxProduct = arr[0]
        var currentMax = arr[0]

        for (i in 1 until n) {
            currentMax = max(arr[i], currentMax * arr[i])
            maxProduct = max(maxProduct, currentMax)
        }

        return "%.3f".format(maxProduct)
    }
}
