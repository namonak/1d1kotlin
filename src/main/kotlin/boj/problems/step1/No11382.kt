package boj.problems.step1

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write("${No11382.solve(input.readLine())}\n")

    input.close()
    output.flush()
    output.close()
}

object No11382 {
    fun solve(input: String): String {
        val (a, b, c) = input.split(" ").map { it.toLong() }
        return (a + b + c).toString()
    }
}
