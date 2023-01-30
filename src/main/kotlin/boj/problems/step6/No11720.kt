package boj.problems.step6

import java.io.*

object No11720 {
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
        val strLen = input.readLine().toInt()
        val inputStr = input.readLine()
        var result = 0
        for (i in 0 until strLen) {
            result += inputStr[i].toString().toInt()
        }
        return result
    }
}
