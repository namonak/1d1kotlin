package boj.problems.step24

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class No1920(private val inputProcessor: InputProcessor, private val outputProcessor: OutputProcessor) {
    @Throws(IOException::class)
    fun solve(input: String): String {
        val (a, b) = inputProcessor.process(input)
        val result = getResult(a, b)
        return outputProcessor.process(result)
    }

    private fun getResult(
        a: IntArray,
        b: IntArray
    ): IntArray {
        val result = IntArray(b.size)

        a.sort()

        b.forEachIndexed { index, i ->
            result[index] = if (a.binarySearch(i) >= 0) 1 else 0
        }

        return result
    }
}

class InputProcessor {
    fun process(input: String): Pair<IntArray, IntArray> {
        val st = StringTokenizer(input.trim())
        val n = st.nextToken().toInt()
        val a = IntArray(n)
        for (i in 0 until n) {
            a[i] = st.nextToken().toInt()
        }

        val m = st.nextToken().toInt()
        val b = IntArray(m)
        for (i in 0 until m) {
            b[i] = st.nextToken().toInt()
        }

        return Pair(a, b)
    }
}

class OutputProcessor {
    fun process(output: IntArray): String {
        return output.joinToString(" ")
    }
}

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.`out`))
    val problem = No1920(InputProcessor(), OutputProcessor())

    output.write("${problem.solve(input.readLine())}\n")

    input.close()
    output.flush()
    output.close()
}
