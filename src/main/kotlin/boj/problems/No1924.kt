package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1924.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No1924 {
    fun solve(input: String): String {
        val (x, y) = input.split(" ").map { it.toInt() }

        val days = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        val monthDays = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

        return days[(monthDays.take(x - 1).sum() + y) % 7]
    }
}
