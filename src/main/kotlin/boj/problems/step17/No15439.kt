package boj.problems.step17

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No15439.solve(input.readLine().toInt()).toString())

    input.close()
    output.flush()
    output.close()
}

object No15439 {
    fun solve(input: Int): Int {
        return input * (input - 1)
    }
}
