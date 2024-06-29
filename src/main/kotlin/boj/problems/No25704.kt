package boj.problems

import java.io.BufferedReader

class No25704 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val p = input.readLine().toInt()

        val coupons = arrayOf(
            Pair(5, 500),
            Pair(10, (p * 0.1).toInt()),
            Pair(15, 2000),
            Pair(20, (p * 0.25).toInt())
        )

        var maxDiscount = 0
        for ((numStamps, discount) in coupons) {
            if (n >= numStamps && discount > maxDiscount) {
                maxDiscount = discount
            }
        }

        val minPayment = p - maxDiscount
        return if (minPayment < 0) "0" else minPayment.toString()
    }
}
