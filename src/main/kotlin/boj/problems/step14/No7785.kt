package boj.problems.step14

import java.io.BufferedReader

class No7785(private val inputProcessor: InputProcessor, private val outputProcessor: OutputProcessor) {
    fun solve(input: BufferedReader): String {
        val logs = inputProcessor.process(input)
        val output = makeResult(logs)
        return outputProcessor.process(output)
    }

    private fun makeResult(logs: List<Log>): List<String> {
        val employees = mutableSetOf<String>()
        for (log in logs) {
            generateLog(log, employees)
        }
        return employees.toList().sortedDescending()
    }

    private fun generateLog(log: Log, employees: MutableSet<String>) {
        if (log.action == "enter") {
            employees.add(log.name)
            return
        }
        employees.remove(log.name)
    }
}

class InputProcessor {
    fun process(input: BufferedReader): List<Log> {
        val number = input.readLine().toInt()
        val logs = mutableListOf<Log>()
        repeat(number) {
            val line = input.readLine()
            val (name, action) = line.split(" ")
            logs.add(Log(name, action))
        }
        return logs
    }
}

class OutputProcessor {
    fun process(output: List<String>): String {
        return output.joinToString("\n")
    }
}

data class Log(val name: String, val action: String)

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()
    val problem = No7785(InputProcessor(), OutputProcessor())

    output.write(problem.solve(input))

    input.close()
    output.flush()
    output.close()
}
