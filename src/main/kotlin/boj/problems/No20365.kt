package boj.problems

import java.io.BufferedReader
import kotlin.math.min

class No20365 {
    fun solve(input: BufferedReader): String {
        val n: Int = input.readLine().toInt()
        val str: String = input.readLine()

        val arr = str.toCharArray()
        var a = 1
        var b = 0
        var color = arr[0]
        var flag = false
        for (i in 1 until n) {
            if (arr[i] != color && !flag) {
                b++
                flag = true
                color = arr[i]
            } else if (arr[i] != color && flag) {
                a++
                flag = false
                color = arr[i]
            }
        }

        val min = (min(a.toDouble(), b.toDouble()) + 1).toInt()
        return min.toString()
    }
}
