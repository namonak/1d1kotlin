package boj.problems.step8

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11005.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No11005 {
    fun solve(input: String): String {
        val (number, radix) = input.split(" ").map { it.toInt() }
        val result = StringBuilder()

        var quotient = number
        while (quotient > 0) {
            val remainder = quotient % radix
            quotient /= radix

            result.append(
                if (remainder < 10) {
                    remainder
                } else {
                    'A' + remainder - 10
                }
            )
        }

        return result.reversed().toString()
    }
}
