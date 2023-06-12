package boj.problems

private const val SECOND_NUMBER = 1

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10817.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No10817 {
    fun solve(input: String): Int {
        return input.split(" ").map { it.toInt() }.sorted()[SECOND_NUMBER]
    }
}
