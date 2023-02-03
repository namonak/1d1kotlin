package boj.problems.step6

import java.io.*
import java.util.*

object No2908 {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val input = BufferedReader(InputStreamReader(System.`in`))
        val output = BufferedWriter(OutputStreamWriter(System.out))
        output.write(solve(input).toString())
        input.close()
        output.flush()
        output.close()
    }

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
