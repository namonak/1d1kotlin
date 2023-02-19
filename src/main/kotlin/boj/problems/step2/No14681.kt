package boj.problems.step2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class No14681(private val inputProcessor: InputProcessor14681, private val outputProcessor: OutputProcessor14681) {
    @Throws(IOException::class)
    fun solve(input: String): String {
        val inputCoordinates = inputProcessor.process(input)
        val outputQuadrant = inputCoordinates.getQuadrant()
        return outputProcessor.process(outputQuadrant)
    }
}

class Coordinates(private val x: Int, private val y: Int) {
    fun getQuadrant(): Int {
        return when {
            x > 0 && y > 0 -> 1
            x < 0 && y > 0 -> 2
            x < 0 && y < 0 -> 3
            else -> 4
        }
    }
}

class InputProcessor14681 {
    fun process(input: String): Coordinates {
        val st = StringTokenizer(input)
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        return Coordinates(x, y)
    }
}

class OutputProcessor14681 {
    fun process(output: Int): String {
        return output.toString()
    }
}

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val problem = No14681(InputProcessor14681(), OutputProcessor14681())

    output.write("${problem.solve(input.readLine())}\n")

    input.close()
    output.flush()
    output.close()
}
