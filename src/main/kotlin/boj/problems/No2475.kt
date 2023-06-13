package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2475.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No2475 {
    fun solve(input: String): Int {
        val numbers = input.split(" ").map { it.toInt() }
        return numbers.sumOf { it * it } % 10
    }
}
