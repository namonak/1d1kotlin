package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11283.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No11283 {
    fun solve(input: String): Int {
        return input[0].code - 44031
    }
}
