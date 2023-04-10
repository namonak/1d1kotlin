package boj.problems.step14

import java.util.StringTokenizer

class No7785(private val inputProcessor: InputProcessor, private val outputProcessor: OutputProcessor) {
    fun solve(input: String): String {
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
    fun process(input: String): List<Log> {
        val st = StringTokenizer(input)
        val n = st.nextToken().toInt()
        val logs = mutableListOf<Log>()
        repeat(n) {
            val name = st.nextToken()
            val action = st.nextToken()
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

    output.write("${problem.solve(input.readLine())}\n")

    input.close()
}
