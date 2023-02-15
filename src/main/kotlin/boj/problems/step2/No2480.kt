package boj.problems.step2

import java.io.*
import java.util.*

object No2480 {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val input = BufferedReader(InputStreamReader(System.`in`))
        val output = BufferedWriter(OutputStreamWriter(System.out))
        output.write(
            """
                ${solve(input)}
                
                """.trimIndent()
        )
        input.close()
        output.flush()
        output.close()
    }

    @Throws(IOException::class)
    fun solve(input: BufferedReader): Int {
        val st = StringTokenizer(input.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val c = st.nextToken().toInt()
        return getPrizeMoney(a, b, c)
    }

    private fun getPrizeMoney(a: Int, b: Int, c: Int): Int {
        if (a == b && b == c) {
            return 10000 + a * 1000
        }
        if (a == b || a == c) {
            return 1000 + a * 100
        }
        return if (b == c) {
            1000 + b * 100
        } else getMaximum(a, b, c) * 100
    }

    private fun getMaximum(a: Int, b: Int, c: Int): Int {
        var max = a
        if (b > max) {
            max = b
        }
        if (c > max) {
            max = c
        }
        return max
    }
}
