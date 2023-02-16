package boj.problems.step2

import java.io.*
import java.util.*

object No1330 {
    @JvmStatic
    @Throws(IOException::class)
    fun main(args: Array<String>) {
        val input = BufferedReader(InputStreamReader(System.`in`))
        val output = BufferedWriter(OutputStreamWriter(System.out))

        output.write(solve(input))

        input.close()
        output.flush()
        output.close()
    }

    @Throws(IOException::class)
    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        return when {
            a < b -> "<"
            a > b -> ">"
            else -> "=="
        }
    }
}
