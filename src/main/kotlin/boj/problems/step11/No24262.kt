package boj.problems.step11

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No24262.solve(input.readLine().toInt()))

    input.close()
    output.flush()
    output.close()
}

object No24262 {
    fun solve(input: Int): String {
        return """
            1
            0
        """.trimIndent()
    }
}
