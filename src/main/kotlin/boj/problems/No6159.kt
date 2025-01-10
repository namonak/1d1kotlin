package boj.problems

import java.io.BufferedReader

class No6159 {
    fun solve(input: BufferedReader): String {
        val (nStr, sStr) = input.readLine().split(' ')
        val n = nStr.toInt()
        val s = sStr.toInt()
        val l = IntArray(n)
        for (i in 0 until n) {
            l[i] = input.readLine().toInt()
        }
        l.sort()
        var left = 0
        var right = n - 1
        var count: Long = 0
        while (left < right) {
            if (l[left] + l[right] <= s) {
                count += (right - left).toLong()
                left += 1
            } else {
                right -= 1
            }
        }
        return count.toString()
    }
}
