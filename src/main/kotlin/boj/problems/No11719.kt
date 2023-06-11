package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11719.solve(input.readText()))

    input.close()
    output.flush()
    output.close()
}

object No11719 {
    fun solve(input: String): String {
        return input
    }
}
