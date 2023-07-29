package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10821.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No10821 {
    fun solve(input: String): Int {
        return input.split(",").count()
    }
}
