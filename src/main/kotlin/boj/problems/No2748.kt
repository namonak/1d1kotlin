package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2748.solve(input.readLine().toInt()).toString())

    input.close()
    output.close()
}

const val MAX = 90
val memo = LongArray(MAX + 1) { - 1 }

object No2748 {
    fun solve(input: Int): Long {
        memo[0] = 0
        memo[1] = 1

        return fibonacci(input)
    }

    private fun fibonacci(n: Int): Long {
        if (memo[n] != -1L) {
            return memo[n]
        }

        memo[n] = fibonacci(n - 1) + fibonacci(n - 2)

        return memo[n]
    }
}
