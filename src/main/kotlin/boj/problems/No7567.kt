package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No7567.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No7567 {
    fun solve(input: String): Int {
        var height = 10

        for (i in 1 until input.length) {
            height += if (input[i] == input[i - 1]) {
                5
            } else {
                10
            }
        }
        return height
    }
}
