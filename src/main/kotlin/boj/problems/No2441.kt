package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2441.solve(input.readLine().toInt()))

    input.close()
    output.close()
}

object No2441 {
    fun solve(n: Int): String {
        val builder = StringBuilder()
        for (i in 0 until n) {
            for (j in 0 until i) {
                builder.append(" ")
            }
            for (j in i until n) {
                builder.append("*")
            }
            builder.append("\n")
        }
        return builder.toString().trimEnd()
    }
}
