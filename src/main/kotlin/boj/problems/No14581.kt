package boj.problems

import java.io.BufferedReader

object No14581 {
    fun solve(input: BufferedReader): String {
        val id = input.readLine()
        return """
            :fan::fan::fan:
            :fan::$id::fan:
            :fan::fan::fan:
            """.trimIndent()
    }
}
