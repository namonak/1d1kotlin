package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11656.solve(input.readLine()))

    input.close()
    output.flush()
}

object No11656 {
    fun solve(input: String): String {
        return input.indices.map { input.substring(it) }.sorted().joinToString("\n")
    }
}
