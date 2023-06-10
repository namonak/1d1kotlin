package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11721.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No11721 {
    fun solve(input: String): String {
        val result = StringBuilder()
        input.forEachIndexed { index, c ->
            result.append(c)
            if (index % 10 == 9) {
                result.append("\n")
            }
        }
        return result.toString()
    }
}
