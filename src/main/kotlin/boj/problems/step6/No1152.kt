package boj.problems.step6

import java.io.*
import java.util.*

object No1152 {
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
        val st = StringTokenizer(input.readLine(), " ")
        return st.countTokens()
    }
}
