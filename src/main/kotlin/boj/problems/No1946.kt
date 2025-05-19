package boj.problems

import java.io.BufferedReader

class No1946 {
    data class Applicant(val doc: Int, val interview: Int)

    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val n = input.readLine().toInt()
            val applicants = MutableList(n) {
                val (a, b) = input.readLine().split(" ").map { it.toInt() }
                Applicant(a, b)
            }

            applicants.sortBy { it.doc }

            var count = 1
            var minInterview = applicants[0].interview

            for (i in 1 until n) {
                if (applicants[i].interview < minInterview) {
                    count++
                    minInterview = applicants[i].interview
                }
            }

            result.appendLine(count)
        }

        return result.toString().trimEnd()
    }
}
