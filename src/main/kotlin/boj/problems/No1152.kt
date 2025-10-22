package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No1152 {
    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine(), " ")
        return st.countTokens().toString()
    }
}
