package boj.problems.step6

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10988.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No10988 {
    fun solve(input: String): Int {
        return if (input == input.reversed()) 1 else 0
    }
}
