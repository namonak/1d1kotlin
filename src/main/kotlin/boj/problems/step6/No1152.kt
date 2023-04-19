package boj.problems.step6

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

object No1152 {
    @Throws(IOException::class)
    fun solve(input: BufferedReader): Int {
        val st = StringTokenizer(input.readLine(), " ")
        return st.countTokens()
    }
}

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))

    output.write(No1152.solve(input))

    input.close()
    output.flush()
    output.close()
}
