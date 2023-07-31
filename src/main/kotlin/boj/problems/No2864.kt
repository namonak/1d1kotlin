package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2864.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No2864 {
    fun solve(input: String): String {
        val (a, b) = input.split(" ").map { it.replace("6", "5") }
        val (c, d) = input.split(" ").map { it.replace("5", "6") }

        return "${a.toInt() + b.toInt()} ${c.toInt() + d.toInt()}"
    }
}
