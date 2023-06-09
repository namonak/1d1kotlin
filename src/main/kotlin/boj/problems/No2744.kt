package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2744.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No2744 {
    fun solve(input: String): String {
        return input.map {
            if (it.isUpperCase()) it.lowercaseChar() else it.uppercaseChar()
        }.joinToString("")
    }
}
