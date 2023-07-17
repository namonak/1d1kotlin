package boj.problems.step10

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No15894.solve(input.readLine().toLong()).toString())

    input.close()
    output.flush()
    output.close()
}

object No15894 {
    fun solve(input: Long): Long {
        return input * 4
    }
}
