package boj.problems.step3

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write("${No25314.solve(input.readLine())}\n")

    input.close()
    output.flush()
    output.close()
}

object No25314 {
    fun solve(input: String): String {
        val number = input.toInt()
        val result = StringBuilder()

        for (i in 1..number / 4) {
            result.append("long ")
        }
        return result.append("int").toString()
    }
}
