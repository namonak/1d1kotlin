package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No3046.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No3046 {
    fun solve(input: String): Int {
        val (r1, s) = input.split(" ").map { it.toInt() }

        return s * 2 - r1
    }
}
