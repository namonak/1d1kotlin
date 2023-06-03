package boj.problems.step21

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No27433.solve(input.readLine().toLong()).toString())

    input.close()
    output.flush()
    output.close()
}

object No27433 {
    fun solve(input: Long): Long {
        return if (input == 0L) 1 else input * solve(input - 1)
    }
}
