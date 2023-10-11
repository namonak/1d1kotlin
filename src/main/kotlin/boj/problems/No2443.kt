package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2443.solve(input.readLine().toInt()))

    input.close()
    output.close()
}

object No2443 {
    fun solve(input: Int): String {
        val sb = StringBuilder()
        for (i in input downTo 1) {
            for (j in 1 until input - i + 1) {
                sb.append(" ")
            }
            for (j in 1 until i * 2) {
                sb.append("*")
            }
            sb.append("\n")
        }
        return sb.toString().trimEnd()
    }
}
