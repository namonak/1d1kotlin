package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No5585.solve(input.readLine().toInt()).toString())

    input.close()
    output.flush()
    output.close()
}

object No5585 {
    fun solve(input: Int): Int {
        var change = 1000 - input
        val coins = listOf(500, 100, 50, 10, 5, 1)
        var result = 0

        for (coin in coins) {
            if (change == 0) break
            if (change < coin) continue
            result += change / coin
            change %= coin
        }

        return result
    }
}
