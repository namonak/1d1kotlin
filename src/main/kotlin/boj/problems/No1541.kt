package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1541.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No1541 {
    fun solve(input: String): Int {
        val numbers = input.split("-")
        val first = numbers[0].split("+").sumOf { it.toInt() }
        val rest = numbers.drop(1).sumOf { it ->
            it.split("+").sumOf { it.toInt() }
        }

        return first - rest
    }
}
