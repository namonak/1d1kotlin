package boj.problems

import java.io.BufferedReader

class No19637 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val titles = Array(n) { "" }
        val limits = LongArray(n) { 0L }

        for (i in 0 until n) {
            val (title, limitStr) = input.readLine().split(" ")
            titles[i] = title
            limits[i] = limitStr.toLong()
        }

        val sb = StringBuilder()
        for (i in 0 until m) {
            val power = input.readLine().toLong()
            var left = 0
            var right = n - 1
            while (left < right) {
                val mid = (left + right) ushr 1
                if (limits[mid] >= power) {
                    right = mid
                } else {
                    left = mid + 1
                }
            }
            sb.append(titles[left]).append("\n")
        }

        return sb.toString().trimEnd()
    }
}
