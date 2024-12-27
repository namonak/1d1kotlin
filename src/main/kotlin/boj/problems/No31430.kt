package boj.problems

import java.io.BufferedReader

class No31430 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        return if (t == 1) {
            val (a, b) = input.readLine().split(" ").map { it.toLong() }
            val k = a + b
            if (k == 3L) {
                "aaaaaaaathree"
            } else {
                val arr = CharArray(13) { 'a' }
                var tmp = k
                for (i in arr.indices) {
                    if (tmp > 0) {
                        arr[i] = ((tmp % 26).toInt() + 'a'.code).toChar()
                        tmp /= 26
                    } else {
                        break
                    }
                }
                arr.joinToString("")
            }
        } else {
            val s = input.readLine()
            if (s == "aaaaaaaathree") {
                "3"
            } else {
                var ans = 0L
                var r = 1L
                for (i in s.indices) {
                    ans += (s[i].code - 'a'.code) * r
                    r *= 26
                }
                ans.toString()
            }
        }
    }
}
