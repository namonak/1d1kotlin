package boj.problems.step2

import java.io.*

object No2753 {
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
        val year = input.readLine().toInt()
        return if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            1
        } else 0
    }
}
