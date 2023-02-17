package boj.problems.step2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter

object No14681 {
    @JvmStatic
    @Throws(IOException::class)
    fun main(args: Array<String>) {
        val input = BufferedReader(InputStreamReader(System.`in`))
        val output = BufferedWriter(OutputStreamWriter(System.out))

        output.write("${solve(input)}\n")

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
        return when {
            x > 0 && y > 0 -> 1
            x < 0 && y > 0 -> 2
            x < 0 && y < 0 -> 3
            else -> 4
        }
    }
}
