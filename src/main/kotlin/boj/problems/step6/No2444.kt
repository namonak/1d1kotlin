package boj.problems.step6

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2444.solve(input.readLine().toInt()))

    input.close()
    output.flush()
    output.close()
}

object No2444 {
    fun solve(n: Int): String {
        val sb = StringBuilder()

        for (i in 1..n) {
            for (j in 1..n - i) {
                sb.append(" ")
            }
            for (j in 1 until 2 * i) {
                sb.append("*")
            }
            sb.append("\n")
        }

        for (i in n - 1 downTo 1) {
            for (j in 1..n - i) {
                sb.append(" ")
            }
            for (j in 1 until 2 * i) {
                sb.append("*")
            }
            sb.append("\n")
        }

        return sb.toString().trimEnd()
    }
}
