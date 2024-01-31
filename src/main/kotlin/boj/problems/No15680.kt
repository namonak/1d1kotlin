package boj.problems

import java.io.BufferedReader

object No15680 {
    fun solve(input: BufferedReader): String {
        return when (input.readLine().toInt()) {
            0 -> "YONSEI"
            else -> "Leading the Way to the Future"
        }
    }
}
