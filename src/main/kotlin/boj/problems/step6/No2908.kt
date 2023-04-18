package boj.problems.step6

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

object No2908 {
    @Throws(IOException::class)
    fun solve(input: BufferedReader): Int {
        val st = StringTokenizer(input.readLine())
        val a = reverseNumber(st.nextToken())
        val b = reverseNumber(st.nextToken())
        return a.coerceAtLeast(b)
    }

    private fun reverseNumber(str: String): Int {
        val sb = StringBuilder(str)
        return sb.reverse().toString().toInt()
    }
}

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))

    output.write(No2908.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}
