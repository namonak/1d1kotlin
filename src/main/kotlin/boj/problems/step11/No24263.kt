package boj.problems.step11

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No24263.solve(input.readLine().toInt()))

    input.close()
    output.flush()
    output.close()
}

object No24263 {
    fun solve(input: Int): String {
        return """
            $input
            1
        """.trimIndent()
    }
}
