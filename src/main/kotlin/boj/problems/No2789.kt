package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2789.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No2789 {
    fun solve(input: String): String {
        val banned = "CAMBRIDGE"

        return input.filter { !banned.contains(it) }
    }
}
