package boj.problems

import java.io.BufferedReader

class No9243 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val before = input.readLine()
        val after = input.readLine()

        return if (n % 2 == 0) {
            if (before == after) "Deletion succeeded" else "Deletion failed"
        } else {
            val result = StringBuilder()
            before.forEach {
                result.append(if (it == '0') '1' else '0')
            }
            if (result.toString() == after) "Deletion succeeded" else "Deletion failed"
        }
    }
}
