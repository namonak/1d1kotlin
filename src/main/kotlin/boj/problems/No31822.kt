package boj.problems

import java.io.BufferedReader

class No31822 {
    fun solve(input: BufferedReader): String {
        val retakeSubjectCode = input.readLine()
        val retakePrefix = retakeSubjectCode.substring(0, 5)

        val n = input.readLine().toInt()

        var count = 0

        repeat(n) {
            val subjectCode = input.readLine()
            if (subjectCode.substring(0, 5) == retakePrefix) {
                count++
            }
        }

        return count.toString()
    }
}
