package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2752.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No2752 {
    fun solve(input: String): String {
        val numbers = input.split(" ").map { it.toInt() }.sorted()
        return numbers.joinToString(" ")
    }
}
