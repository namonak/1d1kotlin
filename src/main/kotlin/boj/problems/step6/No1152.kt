package boj.problems.step6

import java.io.BufferedReader
import java.util.StringTokenizer

object No1152 {
    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine(), " ")
        return st.countTokens().toString()
    }
}
