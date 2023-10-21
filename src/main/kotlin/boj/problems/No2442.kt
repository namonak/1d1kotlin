package boj.problems

fun main() {
    println(No2442.solve(System.`in`.bufferedReader().readLine().toInt()))
}

object No2442 {
    fun solve(n: Int): String {
        val builder = StringBuilder()
        for (i in 0 until n) {
            for (j in 0 until n - i - 1) {
                builder.append(" ")
            }
            for (j in 0 until 2 * i + 1) {
                builder.append("*")
            }
            builder.append("\n")
        }
        return builder.toString().trimEnd()
    }
}
