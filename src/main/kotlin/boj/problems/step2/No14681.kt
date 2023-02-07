package boj.problems.step2

import java.io.*

object No14681 {
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
        val x = input.readLine().toInt()
        val y = input.readLine().toInt()
        return getQuadrant(x, y)
    }

    private fun getQuadrant(x: Int, y: Int): Int {
        if (x > 0 && y > 0) {
            return 1
        }
        if (x < 0 && y > 0) {
            return 2
        }
        return if (x < 0 && y < 0) {
            3
        } else 4
    }
}
