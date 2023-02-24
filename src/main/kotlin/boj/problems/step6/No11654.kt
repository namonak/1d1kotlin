package boj.problems.step6

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class No11654(private val inputProcessor: InputProcessor, private val outputProcessor: OutputProcessor) {
    @Throws(IOException::class)
    fun solve(input: String): String {
        val inputChar = inputProcessor.process(input)
        val outputInt = inputChar.toInt()
        return outputProcessor.process(outputInt)
    }
}

@JvmInline
value class Character(private val code: Int) {
    fun toInt(): Int {
        return code
    }
}

class InputProcessor {
    fun process(input: String): Character {
        return Character(input[0].code)
    }
}

class OutputProcessor {
    fun process(output: Int): String {
        return output.toString()
    }
}

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val problem = No11654(InputProcessor(), OutputProcessor())

    output.write("${problem.solve(input.readLine())}\n")

    input.close()
    output.flush()
    output.close()
}
