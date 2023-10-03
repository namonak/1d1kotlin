package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No15873.solve(input.readLine().toInt()).toString())

    input.close()
    output.close()
}

object No15873 {
    fun solve(input: Int): Int {
        return when {
            input < 100 -> input / 10 + input % 10
            input % 10 == 0 -> 10 + input / 100
            else -> input / 10 + input % 100
        }
    }
}
