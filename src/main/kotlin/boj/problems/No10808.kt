package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10808.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No10808 {
    fun solve(input: String): String {
        val alphabetCount = IntArray(26)
        input.forEach { alphabetCount[it - 'a']++ }
        return alphabetCount.joinToString(" ")
    }
}
