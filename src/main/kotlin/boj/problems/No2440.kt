package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2440.solve(input.readLine().toInt()))

    input.close()
    output.flush()
    output.close()
}

object No2440 {
    fun solve(input: Int): String {
        val result = StringBuilder()
        for (i in input downTo 1) {
            for (j in 1..i) {
                result.append("*")
            }
            result.append("\n")
        }
        return result.toString().trimEnd()
    }
}
