package boj.problems.step6

import java.io.*

object No11654 {
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
        return input.readLine()[0].code
    }
}
