package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No5586.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No5586 {
    fun solve(input: String): String {
        val joi = "JOI"
        val ioi = "IOI"
        var joiCount = 0
        var ioiCount = 0

        for (i in 0 until input.length - 2) {
            if (input.substring(i, i + 3) == joi) {
                joiCount++
            } else if (input.substring(i, i + 3) == ioi) {
                ioiCount++
            }
        }

        return "$joiCount\n$ioiCount"
    }
}
