package boj.problems

import java.io.BufferedReader

class No7785() {
    private data class Log(val name: String, val action: String)

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val logs = mutableListOf<Log>()

        repeat(n) {
            val (name, action) = input.readLine().split(" ")
            logs.add(Log(name, action))
        }

        val result = makeResult(logs)
        return result.joinToString("\n")
    }

    private fun makeResult(logs: List<Log>): List<String> {
        val employees = mutableSetOf<String>()
        for (log in logs) {
            generateLog(log, employees)
        }
        return employees.toList().sortedDescending()
    }

    private fun generateLog(
        log: Log,
        employees: MutableSet<String>
    ) {
        if (log.action == "enter") {
            employees.add(log.name)
            return
        }
        employees.remove(log.name)
    }
}
