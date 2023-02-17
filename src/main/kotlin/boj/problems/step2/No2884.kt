package boj.problems.step2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class No2884(private val inputProcessor: InputProcessor, private val outputProcessor: OutputProcessor) {
    @Throws(IOException::class)
    fun solve(input: String): String {
        val inputTime = inputProcessor.process(input)
        val outputTime = inputTime.minusPresetTime()
        return outputProcessor.process(outputTime)
    }
}

class Time(private val hour: Int, private val minute: Int) {
    fun minusPresetTime(): Time {
        val totalMinute = hour * MINUTES_IN_HOUR + minute
        val minutesToAdd = if (totalMinute < PRESET_TIME) HOURS_IN_DAY * MINUTES_IN_HOUR else 0
        val newTotalMinute = (totalMinute + minutesToAdd - PRESET_TIME) % (HOURS_IN_DAY * MINUTES_IN_HOUR)
        val newHour = newTotalMinute / MINUTES_IN_HOUR
        val newMinute = newTotalMinute % MINUTES_IN_HOUR
        return Time(newHour, newMinute)
    }

    override fun toString(): String {
        return "$hour $minute"
    }

    companion object {
        private const val PRESET_TIME = 45
        private const val HOURS_IN_DAY = 24
        private const val MINUTES_IN_HOUR = 60
    }
}

class InputProcessor {
    fun process(input: String): Time {
        val st = StringTokenizer(input)
        val hour = st.nextToken().toInt()
        val minute = st.nextToken().toInt()
        return Time(hour, minute)
    }
}

class OutputProcessor {
    fun process(output: Time): String {
        return output.toString()
    }
}

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = BufferedWriter(OutputStreamWriter(System.out))
    val problem = No2884(InputProcessor(), OutputProcessor())

    output.write("${problem.solve(input.readLine())}\n")

    input.close()
    output.flush()
    output.close()
}
