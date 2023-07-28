package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2902.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No2902 {
    fun solve(input: String): String = input.split("-").joinToString("") { it.first().toString() }
}
