package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2920.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No2920 {
    fun solve(input: String): String {
        val numbers = input.split(" ").map { it.toInt() }
        var result = ""

        for (i in 1 until numbers.size) {
            if (numbers[i - 1] + 1 == numbers[i]) {
                result = "ascending"
            } else if (numbers[i - 1] - 1 == numbers[i]) {
                result = "descending"
            } else {
                result = "mixed"
                break
            }
        }
        return result
    }
}
