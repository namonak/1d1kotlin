package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

class No2408 {
    fun solve(input: BufferedReader): String {
        val br = input
        val n = br.readLine().toInt()
        val nums = mutableListOf<BigInteger>()
        val ops = mutableListOf<String>()
        nums.add(BigInteger(br.readLine()))
        repeat(n - 1) {
            ops.add(br.readLine())
            nums.add(BigInteger(br.readLine()))
        }

        fun floorDiv(
            x: BigInteger,
            y: BigInteger
        ): BigInteger {
            val q = x.divide(y)
            val r = x.remainder(y)
            return if (r != BigInteger.ZERO && x.signum() * y.signum() < 0) {
                q.subtract(BigInteger.ONE)
            } else {
                q
            }
        }

        val nums2 = mutableListOf<BigInteger>()
        val ops2 = mutableListOf<String>()
        nums2.add(nums[0])
        for (i in ops.indices) {
            val op = ops[i]
            val next = nums[i + 1]
            if (op == "*" || op == "/") {
                val prev = nums2.removeAt(nums2.lastIndex)
                val calc = if (op == "*") prev.multiply(next) else floorDiv(prev, next)
                nums2.add(calc)
            } else {
                ops2.add(op)
                nums2.add(next)
            }
        }

        var result = nums2[0]
        for (i in ops2.indices) {
            val op = ops2[i]
            val next = nums2[i + 1]
            result = if (op == "+") result.add(next) else result.subtract(next)
        }

        return result.toString()
    }
}
